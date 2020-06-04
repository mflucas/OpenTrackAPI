package apiStreckeTest;

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
		if(otMessage instanceof TrainCreated) {
			TrainCreated newTrain =(TrainCreated)otMessage;
			if(newTrain.getTrainID().equals("t 10 E J M 6")) {
				command.setPositionSpeed("t 10 E J M 6", 30, "x_Bremsteststrecke-178-R:[16]-[20]", 0, "x_Bremsteststrecke-183-R:[20]-[30]", 0);			

			}
		}
			
			if(otMessage instanceof RouteEntry) {

				RouteEntry entry = (RouteEntry) otMessage;
				if (entry.getRouteID().equals("x_Bremsteststrecke-91-R:[8]-[12]") && entry.getTrainID().equals("t 10 E J M 4")){
					System.out.println("GOT HERE \n");
					command.setRequestedSpeed("t 10 E J M 4", 0);
					command.setRequestedDeceleration("t 10 E J M 4", 0.035);
				
				}
			}

			
		
//"x_Bremsteststrecke-8-R:[8]-[12]
//command.setPositionSpeed("t 10 E J M 4", 0, "x_Bremsteststrecke-86-R:[4]-[8]", 0, "x_Bremsteststrecke-101-R:[16]-[20]", 0);

//command.setRequestedSpeed("t 10 E J M 6", 10, 22000);
		}


		if (otMessage instanceof SimStopped) {
			if (Constants.RUN_FROM_BATCHFILE) {
				return;
			} else {
				System.exit(0);
			}
		}

	}
}
