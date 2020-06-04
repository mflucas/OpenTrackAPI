package aGotthardTests;

import java.io.IOException;
import Common.Constants;
import oTDtoOpenTrack.*;

/**
 * In this class the general simulation parameters are set
 * These are called from the main class Run.java before the start of the simulation
 * The OpenTrack Server has to be up and running.
 * @author Lucas Meyer de Freitas, EBP
 */
public class SimulationPrep {
	
	static SimController simController = new SimController();
			public static void prepareSimulation() throws IOException {
				
			if(Constants.RUN_FROM_BATCHFILE) {
				return;
			} else {
				simController.setSimulationStartTime(Constants.SIM_START_TIME);
				simController.setSimulationEndTime(Constants.SIM_END_TIME);
				simController.setDelayScenario(Constants.DELAY_SCENARIO);
			}
		}
}
