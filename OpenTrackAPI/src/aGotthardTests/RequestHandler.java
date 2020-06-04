package aGotthardTests;

import java.io.IOException;
import javax.xml.bind.JAXBException;

import Common.Constants;
import oTDtoOpenTrack.*;
import openTracktoOTD.*;
import utilsOTtoJava.*;

/**
 * This class contains the commands that are sent to OpenTrack DURING the
 * simulation
 * 
 * @author Lucas Meyer de Freitas, EBP
 */
public class RequestHandler {

	SimController command = new SimController();
	String trainToStop = null;

	public void responseBased(OpenTrack otMessage) throws IOException, JAXBException {
		
		//Only do something if dispatching from API is on (see Constants)
		if(Constants.DISPATCHING_ON) {
			
//		1_Set commands at start of the simulation (before the first train starts running)
		if (otMessage instanceof SimStarted) {
//			command.setSendPositionReports("t 25050 F J M 528", true, 5);
//			command.setPositionSpeed("t 10 E J M 6", 30, "x_Bremsteststrecke-178-R:[16]-[20]", 200, "x_Bremsteststrecke-183-R:[20]-[30]",
//					0, 21600, 36000, true);
		}

//		2_Set commands during the simulation (before first train starts running

		/*
		 * Trains being joined together:
		 * 
		 * 
		 * 
		 * 
		 * 
		 * t 25050 F J M 520 - t 25100 G J M 871 t 25050 F J M 522 - t 25100 G J M 873 t
		 * 25050 F J M 524 - t 25100 G J M 875 t 25050 F J M 526 - t 25100 G J M 877 t
		 * 25050 F J M 552 - t 25100 G J M 903 t 25050 F J M 554 - t 25100 G J M 905 t
		 * 25050 F J M 556 - t 25100 G J M 907
		 * 
		 * Kurse die zusammengeführt werden t 25050 F J M 528 - t 25050 E J M 571 t
		 * 25050 F J M 530 - t 25050 E J M 573 t 25050 F J M 532 - t 25050 E J M 575 t
		 * 25050 F J M 534 - t 25050 E J M 577 t 25050 F J M 536 - t 25050 E J M 579 t
		 * 25050 F J M 538 - t 25050 E J M 581 t 25050 F J M 540 - t 25050 E J M 583 t
		 * 25050 F J M 542 - t 25050 E J M 585 t 25050 F J M 544 - t 25050 E J M 587 t
		 * 25050 F J M 546 - t 25050 E J M 589 t 25050 F J M 548 - t 25050 E J M 591 t
		 * 25050 F J M 550 - t 25050 E J M 593 t 25050 E J M 571 - t 25050 F J M 528 t
		 * 25050 E J M 573 - t 25050 F J M 530 t 25050 E J M 575 - t 25050 F J M 532 t
		 * 25050 E J M 577 - t 25050 F J M 534 t 25050 E J M 579 - t 25050 F J M 536 t
		 * 25050 E J M 581 - t 25050 F J M 538 t 25050 E J M 583 - t 25050 F J M 540 t
		 * 25050 E J M 585 - t 25050 F J M 542 t 25050 E J M 587 - t 25050 F J M 544 t
		 * 25050 E J M 589 - t 25050 F J M 546 t 25050 E J M 591 - t 25050 F J M 548 t
		 * 25050 E J M 593 - t 25050 F J M 550
		 */

		// Unmarshall to TrainPositionReport falls OTMessage einen TrainPositionReport
		// ist
		if (otMessage instanceof TrainDeparture) {
			TrainDeparture departure = (TrainDeparture) otMessage;
			
			if(departure.getTrainID().equals("t 21200 I J M 380")) {
				
				command.setSendPositionReports(departure.getTrainID(), true, 1);
				
			}
			
		}
		
		
		if (otMessage instanceof TrainPositionReport) {
			TrainPositionReport position = (TrainPositionReport) otMessage;
			
			float delay = Float.parseFloat(position.getDelay());
		 
			if (Constants.COURSES_TO_BEL.contains(position.getTrainID()) && delay>599) {
				
				command.setTerminalStation(position.getTrainID(), "BEL");
				if(position.getTrainID().equals("t 851 E J M 128")) {
					command.deactivateTrain("t 650 F J M 75");
					command.activateTrain("t 650 F J M 7500");
				
				
				}
			}
		}

		if (otMessage instanceof InfraPartReserved) {
			InfraPartReserved reserved = (InfraPartReserved) otMessage;
			if (Constants.COURSES_TO_BEL.contains(reserved.getTrainID())) {
				command.setSendPositionReports(reserved.getTrainID(), true);
				command.setSendPositionReports(reserved.getTrainID(), true, 5);
			}

		}
		
		
		}

//		if (otMessage instanceof TrainCreated) {
//			TrainCreated train = (TrainCreated) otMessage;
//			if (Constants.COURSES_TO_BEL.contains(train.getTrainID())) {
//				command.setTerminalStation(train.getTrainID(), "BEL");
//				command.setSendPositionReports(train.getTrainID(), true, 20);
//			}
//		}

		// 1 Deactivate LUG-BEL train

		// 2 Activate BEL-GD train

//		3_Terminate Java application if simulation stops
		if (otMessage instanceof SimStopped) {
			if (Constants.RUN_FROM_BATCHFILE) {
				return;
			} else {
				System.exit(0);
			}
		}

	}
}
