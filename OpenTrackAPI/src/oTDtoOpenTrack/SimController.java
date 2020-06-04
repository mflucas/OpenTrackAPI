package oTDtoOpenTrack;


import java.io.IOException;

/**
 * This class contains all request methods (OTD to OpenTrack) defined in Chapter 5.1 of the Manual 
 * "Using the OpenTrack API" - Version 1.10 - 2019-10-07"
 * @author Lucas Meyer de Freitas, EBP
 */
public class SimController {
	
	Sender sender = new Sender();
	
	/**
	 * setSimulationStartTime
	 * @param time
	 * @throws IOException
	 */
	public void setSimulationStartTime(float time) throws IOException {
		String command =  "<setSimulationStartTime time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setSimulationEndTime
	 * @param time
	 * @throws IOException
	 */
	public void setSimulationEndTime(float time) throws IOException {
		String command =  "<setSimulationEndTime time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setSimulationPauseTime
	 * @param time
	 * @throws IOException
	 */
	public void setSimulationPauseTime(float time) throws IOException {
		String command =  "<setSimulationPauseTime time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setSimulationStep
	 * @param time
	 * @throws IOException
	 */
	public void setSimulationStep(float time) throws IOException {
		String command =  "<setSimulationStep time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setSimulationRate
	 * @param rate
	 * @throws IOException
	 */
	public void setSimulationRate(String rate) throws IOException {
		String command =  "<setSimulationRate time=\""+rate+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setDelayScenario
	 * @param scenarioID
	 * @throws IOException
	 */
	public void setDelayScenario(int scenarioID) throws IOException {
		String command =  "<setDelayScenario scenarioID=\""+Integer.toString(scenarioID)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * startSimulation
	 * @throws IOException
	 */
	public void startSimulation() throws IOException {
		String command =  "<startSimulation/>";
		sender.otHttpRequest(command);
	}
	/**
	 * startSimulation
	 * @param time
	 * @throws IOException
	 */
	public void startSimulation(float time) throws IOException {
		String command =  "<startSimulation time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * pauseSimulation
	 * @throws IOException
	 */
	public void pauseSimulation() throws IOException {
		String command =  "<pauseSimulation/>";
		sender.otHttpRequest(command);
	}
	/**
	 * pauseSimulation
	 * @param time
	 * @throws IOException
	 */
	public void pauseSimulation(float time) throws IOException {
		String command =  "<pauseSimulation time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * endSimulation
	 * @throws IOException
	 */
	public void endSimulation() throws IOException {
		String command =  "<endSimulation/>";
		sender.otHttpRequest(command);
	}
	/**
	 * endSimulation
	 * @param time
	 * @throws IOException
	 */
	public void endSimulation(float time) throws IOException {
		String command =  "<endSimulation time=\""+Float.toString(time)+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * terminateApplication
	 * @throws IOException
	 */
	public void terminateApplication() throws IOException {
		String command =  "<terminateApplication/>";
		sender.otHttpRequest(command);
	}
	/**
	 * infoPanel
	 * @throws IOException
	 */
	public void infoPanel() throws IOException {
		String command =  "<infoPanel/>";
		sender.otHttpRequest(command);
	}
	/**
	 * removeTrain
	 * @param trainID
	 * @throws IOException
	 */
	public void removeTrain(String trainID) throws IOException {
		String command =  "<removeTrain trainID=\""+trainID+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * activateTrain
	 * @param trainID
	 * @throws IOException
	 */
	public void activateTrain(String trainID) throws IOException {
		String command =  "<activateTrain trainID=\""+trainID+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * deactivateTrain
	 * @param trainID
	 * @throws IOException
	 */
	public void deactivateTrain(String trainID) throws IOException {
		String command =  "<deactivateTrain trainID=\""+trainID+"\"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setRequestedSpeed
	 * @param trainID
	 * @param speed
	 * @throws IOException
	 */
	public void setRequestedSpeed(String trainID, float speed) throws IOException {
		String command =  "<setRequestedSpeed trainID=\""+trainID+"\" "+"speed=" +"\""+ speed+"\""   +"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setRequestedSpeed
	 * @param trainID
	 * @param speed
	 * @param time
	 * @throws IOException
	 */
	public void setRequestedSpeed(String trainID, float speed, float time) throws IOException {
		String command =  "<setRequestedSpeed trainID=\""+trainID+"\""+" speed=" +"\""+ speed+"\""+
							" time=" +"\""+ time+"\""+"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * resetRequestedSpeed
	 * @param trainID
	 * @throws IOException
	 */
	public void resetRequestedSpeed(String trainID) throws IOException {
		String command =  "<resetRequestedSpeed trainID=\""+trainID+"\""+"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * resetRequestedSpeed
	 * @param trainID
	 * @param time
	 * @throws IOException
	 */
	public void resetRequestedSpeed(String trainID, float time) throws IOException {
		String command =  "<resetRequestedSpeed"+ 
				" trainID=" +"\""+ trainID+"\""+
				" time=" +"\""+ time+"\"" +
				"/>";	
		sender.otHttpRequest(command);
	}
	/**
	 * setMaximumAcceleration
	 * @param trainID
	 * @param acceleration
	 * @throws IOException
	 */
	public void setMaximumAcceleration(String trainID, float acceleration) throws IOException {
		String command =  "<setMaximumAcceleration trainID=\""+trainID+"\" "+"acceleration=" +"\""+ acceleration+"\""   +"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setMaximumAcceleration
	 * @param trainID
	 * @param acceleration
	 * @param time
	 * @throws IOException
	 */
	public void setMaximumAcceleration(String trainID, float acceleration, float time) throws IOException {
		String command =  "<setMaximumAcceleration trainID=\""+trainID+"\""+" acceleration=" +"\""+ acceleration+"\""+
				" time=" +"\""+ time+"\""+"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * resetMaximumAcceleration
	 * @param trainID
	 * @throws IOException
	 */
	public void resetMaximumAcceleration(String trainID) throws IOException {
		String command =  "<resetMaximumAcceleration trainID=\""+trainID+"\""+"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * resetMaximumAcceleration
	 * @param trainID
	 * @param time
	 * @throws IOException
	 */
	public void resetMaximumAcceleration(String trainID, float time) throws IOException {
		String command =  "<resetMaximumAcceleration trainID=\""+trainID+"\" "+"time=" +"\""+ time+"\""   +"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setRequestedDeceleration
	 * @param trainID
	 * @param deceleration
	 * @throws IOException
	 */
	public void setRequestedDeceleration(String trainID, double deceleration) throws IOException {
		String command =  "<setRequestedDeceleration trainID=\""+trainID+"\" "+"deceleration=" +"\""+ deceleration+"\""   +"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * setRequestedDeceleration
	 * @param trainID
	 * @param deceleration
	 * @param time
	 * @throws IOException
	 */
	public void setRequestedDeceleration(String trainID, double deceleration, float time) throws IOException {
		String command =  "<setRequestedDeceleration trainID=\""+trainID+"\""+" deceleration=" +"\""+ deceleration+"\""+
				" time=" +"\""+ time+"\""+"/>";		
		sender.otHttpRequest(command);
	}
	/**
	 * resetMaximumDeceleration
	 * @param trainID
	 * @throws IOException
	 */
	public void resetMaximumDeceleration(String trainID) throws IOException {
		String command =  "<resetMaximumDeceleration trainID=\""+trainID+"\""+"/>";
		sender.otHttpRequest(command);
	}
	/**
	 * resetMaximumDeceleration
	 * @param trainID
	 * @param time
	 * @throws IOException
	 */
	public void resetMaximumDeceleration(String trainID, float time) throws IOException {
		String command =  "<resetMaximumDeceleration trainID=\""+trainID+"\" "+"time=" +"\""+ time+"\""   +"/>";
		sender.otHttpRequest(command);
	}

	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param trainID: optional, if not defined, speed restriction is valid for all trains 
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime: optional, if not defined, speed restriction starts at begin of simulation run 
	 * @param endTime: optional, if not defined, speed restriction ends at end of simulation run 
	 * @param headOnlyFlag
	 * @throws IOException
	 */
	public void setPositionSpeed(String trainID, float speed, String startRouteID, float startRouteOffset, String endRouteID, 
								float endRouteOffset, float startTime, float endTime, boolean headOnlyFlag) throws IOException {
		String command =  "<setPositionSpeed trainID=\""+trainID+"\""+" speed=" +"\""+ speed+"\""+
				" startRouteID=" +"\""+ startRouteID+"\"" +
				" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
				" endRouteID=" +"\""+ endRouteID+"\"" +
				" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
				" startTime=" +"\""+ startTime+"\"" +
				" endTime=" +"\""+ endTime+"\"" +
				" headOnlyFlag=" +"\""+ headOnlyFlag+"\"" +
				"/>";	
		sender.otHttpRequest(command);
	}
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param trainID: optional, if not defined, speed restriction is valid for all trains 
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime: optional, if not defined, speed restriction starts at begin of simulation run 
	 * @param endTime: optional, if not defined, speed restriction ends at end of simulation run 
	 * @throws IOException
	 */
	public void setPositionSpeed(String trainID, float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset, float startTime, float endTime) throws IOException {
String command =  "<setPositionSpeed trainID=\""+trainID+"\""+" speed=" +"\""+ speed+"\""+
" startRouteID=" +"\""+ startRouteID+"\"" +
" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
" endRouteID=" +"\""+ endRouteID+"\"" +
" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
" startTime=" +"\""+ startTime+"\"" +
" endTime=" +"\""+ endTime+"\"" +
"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param trainID: optional, if not defined, speed restriction is valid for all trains 
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime: optional, if not defined, speed restriction starts at begin of simulation run 
	 * @throws IOException
	 */
	public void setPositionSpeed(String trainID, float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset, float startTime) throws IOException {
String command =  "<setPositionSpeed trainID=\""+trainID+"\""+" speed=" +"\""+ speed+"\""+
" startRouteID=" +"\""+ startRouteID+"\"" +
" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
" endRouteID=" +"\""+ endRouteID+"\"" +
" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
" startTime=" +"\""+ startTime+"\"" +
"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param trainID: optional, if not defined, speed restriction is valid for all trains 
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @throws IOException
	 */
	public void setPositionSpeed(String trainID, float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset) throws IOException {
			String command =  "<setPositionSpeed trainID=\""+trainID+"\""+" speed=" +"\""+ speed+"\""+
			" startRouteID=" +"\""+ startRouteID+"\"" +
			" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
			" endRouteID=" +"\""+ endRouteID+"\"" +
			" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
			"/>";	
			sender.otHttpRequest(command);
			}
	
	
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains		
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime
	 * @param endTime
	 * @param headOnlyFlag
	 * @throws IOException
	 */
	public void setPositionSpeed(float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset, float startTime, float endTime, boolean headOnlyFlag) throws IOException {
		String command =  "<setPositionSpeed speed=\""+speed+"\""+
						" startRouteID=" +"\""+ startRouteID+"\"" +
						" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
						" endRouteID=" +"\""+ endRouteID+"\"" +
						" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
						" startTime=" +"\""+ startTime+"\"" +
						" endTime=" +"\""+ endTime+"\"" +
						" headOnlyFlag=" +"\""+ headOnlyFlag+"\"" +
						"/>";	
		sender.otHttpRequest(command);
		}
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime
	 * @param endTime
	 * @throws IOException
	 */
	public void setPositionSpeed(float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset, float startTime, float endTime) throws IOException {
		String command =  "<setPositionSpeed speed=\""+speed+"\""+
						" startRouteID=" +"\""+ startRouteID+"\"" +
						" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
						" endRouteID=" +"\""+ endRouteID+"\"" +
						" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
						" startTime=" +"\""+ startTime+"\"" +
						" endTime=" +"\""+ endTime+"\"" +
						"/>";	
		sender.otHttpRequest(command);
		}
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime
	 * @throws IOException
	 */
	public void setPositionSpeed(float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset, float startTime) throws IOException {
		String command =  "<setPositionSpeed speed=\""+speed+"\""+
						" startRouteID=" +"\""+ startRouteID+"\"" +
						" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
						" endRouteID=" +"\""+ endRouteID+"\"" +
						" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
						" startTime=" +"\""+ startTime+"\"" +
						"/>";	
		sender.otHttpRequest(command);
		}
	/**
	 * setPositionSpeed
	 * Speed restrictions from a given position to another for one or for all trains
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @throws IOException
	 */
	public void setPositionSpeed(float speed, String startRouteID, float startRouteOffset, String endRouteID, 
			float endRouteOffset) throws IOException {
		String command =  "<setPositionSpeed speed=\""+speed+"\""+
						" startRouteID=" +"\""+ startRouteID+"\"" +
						" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
						" endRouteID=" +"\""+ endRouteID+"\"" +
						" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
						"/>";	
		sender.otHttpRequest(command);
		}
	/**
	 * setPositionCoasting: Engine is shut off between start and end defined
	 * @param trainID
	 * @param speed
	 * @param startRouteID
	 * @param startRouteOffset
	 * @param endRouteID
	 * @param endRouteOffset
	 * @param startTime
	 * @param endTime
	 * @throws IOException
	 */
	public void setPositionCoasting(String trainID, float speed, String startRouteID, float startRouteOffset, String endRouteID, 
					float endRouteOffset, float startTime, float endTime) throws IOException {
		String command =  "<setPositionCoasting trainID=\""+trainID+"\""+" speed=" +"\""+ speed+"\""+
		" startRouteID=" +"\""+ startRouteID+"\"" +
		" startRouteOffset=" +"\""+ startRouteOffset+"\"" +
		" endRouteID=" +"\""+ endRouteID+"\"" +
		" endRouteOffset=" +"\""+ endRouteOffset+"\"" +
		" startTime=" +"\""+ startTime+"\"" +
		" endTime=" +"\""+ endTime+"\"" +
		"/>";	
		sender.otHttpRequest(command);
		}
	/**
	 * setEngineSwitch
	 * @param trainID
	 * @param switchOnOffFlag
	 * @throws IOException
	 */
	public void setEngineSwitch(String trainID, boolean switchOnOffFlag) throws IOException {
String command =  "<setEngineSwitch"+ 
			" trainID=" +"\""+ trainID+"\""+
			" switchOnOffFlag=" +"\""+ switchOnOffFlag+"\"" +
			"/>";	
sender.otHttpRequest(command);
}	
	/**
	 * setEngineSwitch
	 * @param trainID
	 * @param switchOnOffFlag
	 * @param time: Time during which engine remains shut off
	 * @throws IOException
	 */
	public void setEngineSwitch(String trainID, boolean switchOnOffFlag, float time) throws IOException {
String command =  "<setEngineSwitch"+ 
			" trainID=" +"\""+ trainID+"\""+
			" switchOnOffFlag=" +"\""+ switchOnOffFlag+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
sender.otHttpRequest(command);
}	
	/**
	 * setPerformance
	 * @param trainID
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @throws IOException
	 */
	public void setPerformance(String trainID, float performanceFactorOnTime, float performanceFactorDelayed) throws IOException {
String command =  "<setPerformance"+ 
			" trainID=" +"\""+ trainID+"\""+
			" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\"" +
			" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\"" +
			"/>";	
sender.otHttpRequest(command);
}	
	/**
	 * setPerformance
	 * @param trainID
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param time: Not known yet which time is meant here
	 * @throws IOException
	 */
	public void setPerformance(String trainID, float performanceFactorOnTime, float performanceFactorDelayed, float time) throws IOException {
String command =  "<setPerformance"+ 
			" trainID=" +"\""+ trainID+"\""+
			" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\"" +
			" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
sender.otHttpRequest(command);
}	
	/**
	 * setSendPositionReports: Send only one position report
	 * @param trainID
	 * @param flag
	 * @throws IOException
	 */
	public void setSendPositionReports(String trainID, boolean flag) throws IOException {
String command =  "<setSendPositionReports"+ 
			" trainID=" +"\""+ trainID+"\""+
			" flag=" +"\""+ flag+"\"" +
			"/>";	
sender.otHttpRequest(command);
}	
	/**
	 * setSendPositionReports: Send position reports continuously at a given time interval
	 * @param trainID
	 * @param flag
	 * @param time: Intervall at which position reports are sent
	 * @throws IOException
	 */
	public void setSendPositionReports(String trainID, boolean flag, float time) throws IOException {
String command =  "<setSendPositionReports"+ 
			" trainID=" +"\""+ trainID+"\""+
			" flag=" +"\""+ flag+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
sender.otHttpRequest(command);
}	
	/**
	 * setWaitForDeparture
	 * @param trainID
	 * @param flag
	 * @throws IOException
	 */
	public void setWaitForDeparture(String trainID, boolean flag) throws IOException {
String command =  "<setWaitForDeparture"+ 
			" trainID=" +"\""+ trainID+"\""+
			" flag=" +"\""+ flag+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setDepartureCommand
	 * @param trainID
	 * @throws IOException
	 */
	public void setDepartureCommand(String trainID) throws IOException {
String command =  "<setDepartureCommand"+ 
			" trainID=" +"\""+ trainID+"\""+
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setDepartureCommand
	 * @param trainID
	 * @param time
	 * @throws IOException
	 */
	public void setDepartureCommand(String trainID, float time) throws IOException {
String command =  "<setDepartureCommand"+ 
			" trainID=" +"\""+ trainID+"\""+
			" time=" +"\""+ time+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
		
	/**
	 * <h1>addTimetableEntry<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param stationID
	 * @param arrivalTime
	 * @param departureTime
	 * @param dwellTime
	 * @param stopFlag
	 * @throws IOException
	 */
	public void addTimetableEntry(String trainID, String stationID, float arrivalTime, float departureTime, 
			float dwellTime, boolean stopFlag) throws IOException {
String command =  "<addTimetableEntry"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" arrivalTime=" +"\""+ arrivalTime+"\"" +
			" departureTime=" +"\""+ departureTime+"\"" +
			" dwellTime=" +"\""+ dwellTime+"\"" +
			" stopFlag=" +"\""+ stopFlag+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * <h1>addTimetableEntry<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param stationID
	 * @param arrivalTime
	 * @param departureTime
	 * @param dwellTime
	 * @throws IOException
	 */
	public void addTimetableEntry(String trainID, String stationID, float arrivalTime, float departureTime, 
			float dwellTime) throws IOException {
String command =  "<addTimetableEntry"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" arrivalTime=" +"\""+ arrivalTime+"\"" +
			" departureTime=" +"\""+ departureTime+"\"" +
			" dwellTime=" +"\""+ dwellTime+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	
	/**
	 * <h1>addTimetableEntry<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
     * @param trainID
	 * @param stationID
	 * @param arrivalTime
	 * @param departureTime
	 * @throws IOException
	 */
	public void addTimetableEntry(String trainID, String stationID, float arrivalTime, float departureTime) throws IOException {
String command =  "<addTimetableEntry"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" arrivalTime=" +"\""+ arrivalTime+"\"" +
			" departureTime=" +"\""+ departureTime+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * <h1>addTimetableEntry<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"

	 * @param trainID
	 * @param stationID
	 * @param arrivalTime
	 * @throws IOException
	 */
	public void addTimetableEntry(String trainID, String stationID, float arrivalTime) throws IOException {
String command =  "<addTimetableEntry"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" arrivalTime=" +"\""+ arrivalTime+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * <h1>addTimetableEntry<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"

	 * @param trainID
	 * @param stationID
	 * @throws IOException
	 */
	public void addTimetableEntry(String trainID, String stationID) throws IOException {
String command =  "<addTimetableEntry"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setArrivalTime
	 * @param trainID
	 * @param stationID
	 * @param time
	 * @throws IOException
	 */
	public void setArrivalTime(String trainID, String stationID, float time) throws IOException {
String command =  "<setArrivalTime"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setDepartureTime
	 * @param trainID
	 * @param stationID
	 * @param time
	 * @throws IOException
	 */
	public void setDepartureTime(String trainID, String stationID, float time) throws IOException {
String command =  "<setDepartureTime"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setPassingTime
	 * @param trainID
	 * @param stationID
	 * @param time
	 * @throws IOException
	 */
	public void setPassingTime(String trainID, String stationID, float time) throws IOException {
		String command =  "<setPassingTime"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setDwellTime
	 * @param trainID
	 * @param stationID
	 * @param time
	 * @throws IOException
	 */
	public void setDwellTime(String trainID, String stationID, float time) throws IOException {
		String command =  "<setDwellTime"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" time=" +"\""+ time+"\"" +
			"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setStop
	 * @param trainID
	 * @param stationID
	 * @param stopFlag
	 * @throws IOException
	 */
	public void setStop(String trainID, String stationID, boolean stopFlag) throws IOException {
		String command =  "<setStop"+ 
			" trainID=" +"\""+ trainID+"\""+
			" stationID=" +"\""+ stationID+"\"" +
			" stopFlag=" +"\""+ stopFlag+"\"" +
			"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setConnection
	 * @param trainID
	 * @param connTrainID
	 * @param stationID
	 * @param connectionTime
	 * @param maxConnectionTime
	 * @param joinFlag
	 * @param splitFlag
	 * @throws IOException
	 */
	public void setConnection(String trainID, String connTrainID, String stationID, float connectionTime, 
								float maxConnectionTime, boolean joinFlag, boolean splitFlag) throws IOException {
		String command =  "<setConnection"+ 
			" trainID=" +"\""+ trainID+"\""+
			" connTrainID=" +"\""+ connTrainID+"\"" +
			" stationID=" +"\""+ stationID+"\"" +
			" connectionTime=" +"\""+ connectionTime+"\"" +
			" maxConnectionTime=" +"\""+ maxConnectionTime+"\"" +
			" joinFlag=" +"\""+ joinFlag+"\"" +
			" splitFlag=" +"\""+ splitFlag+"\"" +
			"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setConnection
	 * @param trainID
	 * @param connTrainID
	 * @param stationID
	 * @param connectionTime
	 * @param maxConnectionTime
	 * @param joinFlag
	 * @throws IOException
	 */
	public void setConnection(String trainID, String connTrainID, String stationID, float connectionTime, 
			float maxConnectionTime, boolean joinFlag) throws IOException {
String command =  "<setConnection"+ 
" trainID=" +"\""+ trainID+"\""+
" connTrainID=" +"\""+ connTrainID+"\"" +
" stationID=" +"\""+ stationID+"\"" +
" connectionTime=" +"\""+ connectionTime+"\"" +
" maxConnectionTime=" +"\""+ maxConnectionTime+"\"" +
" joinFlag=" +"\""+ joinFlag+"\"" +
"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setConnection
	 * @param trainID
	 * @param connTrainID
	 * @param stationID
	 * @param connectionTime
	 * @param maxConnectionTime
	 * @throws IOException
	 */
	public void setConnection(String trainID, String connTrainID, String stationID, float connectionTime, 
			float maxConnectionTime) throws IOException {
String command =  "<setConnection"+ 
" trainID=" +"\""+ trainID+"\""+
" connTrainID=" +"\""+ connTrainID+"\"" +
" stationID=" +"\""+ stationID+"\"" +
" connectionTime=" +"\""+ connectionTime+"\"" +
" maxConnectionTime=" +"\""+ maxConnectionTime+"\"" +
"/>";	
sender.otHttpRequest(command);
}
	/**
	 * setConnection
	 * @param trainID
	 * @param connTrainID
	 * @param stationID
	 * @param connectionTime
	 * @throws IOException
	 */
	public void setConnection(String trainID, String connTrainID, String stationID, float connectionTime) throws IOException {
String command =  "<setConnection"+ 
" trainID=" +"\""+ trainID+"\""+
" connTrainID=" +"\""+ connTrainID+"\"" +
" stationID=" +"\""+ stationID+"\"" +
" connectionTime=" +"\""+ connectionTime+"\"" +
"/>";	
sender.otHttpRequest(command);
}
	/**
	 * cancelConnection
	 * @param trainID
	 * @param connTrainID
	 * @param stationID
	 * @throws IOException
	 */
	public void cancelConnection(String trainID, String connTrainID, String stationID) throws IOException {
			String command =  "<cancelConnection"+ 
			" trainID=" +"\""+ trainID+"\""+
			" connTrainID=" +"\""+ connTrainID+"\"" +
			" stationID=" +"\""+ stationID+"\"" +
			"/>";	
			sender.otHttpRequest(command);
}
	/**
	 * setTerminalStation
	 * @param trainID
	 * @param stationID
	 * @throws IOException
	 */
	public void setTerminalStation(String trainID, String stationID) throws IOException {
		String command =  "<setTerminalStation"+ 
		" trainID=" +"\""+ trainID+"\""+
		" stationID=" +"\""+ stationID+"\"" +
		"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * resetTimetable
	 * @throws IOException
	 */
	public void resetTimetable() throws IOException {
		String command =  "<resetTimetable"+ "/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setPriorityOfStartItinerary: Define/change the start location, based on the priority of the itinerary
	 * @param trainID
	 * @param priority: 1 <= priority <= number of defined itineraries of the corresponding course 
	 * @throws IOException
	 */
	public void setPriorityOfStartItinerary(String trainID, int priority) throws IOException {
		String command =  "<setPriorityOfStartItinerary"+ 
				" trainID=" +"\""+ trainID+"\""+
				" priority=" +"\""+ priority+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setRouteAllowed: which route(s) a train may use 
	 * @param trainID
	 * @param routeID
	 * @throws IOException
	 */
	public void setRouteAllowed(String trainID, String routeID) throws IOException {
		String command =  "<setRouteAllowed"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setRouteAllowed: which route(s) a train may use 
	 * @param trainID
	 * @param routeID
	 * @param time
	 * @throws IOException
	 */
	public void setRouteAllowed(String trainID, String routeID, float time) throws IOException {
		String command =  "<setRouteAllowed"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				" time=" +"\""+ time+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setRouteDisallowed: Cancellation
	 * @param trainID
	 * @param routeID
	 * @throws IOException
	 */
	public void setRouteDisallowed(String trainID, String routeID) throws IOException {
		String command =  "<setRouteDisallowed"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setRouteDisallowed: cancellation
	 * @param trainID
	 * @param routeID
	 * @param time
	 * @throws IOException
	 */
	public void setRouteDisallowed(String trainID, String routeID, float time) throws IOException {
		String command =  "<setRouteDisallowed"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				" time=" +"\""+ time+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setRouteReserve: really reserve a route from external 
	 * @param trainID
	 * @param routeID
	 * @throws IOException
	 */
	public void setRouteReserve(String trainID, String routeID) throws IOException {
		String command =  "<setRouteReserve"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setRouteReserve: really reserve a route from external 
	 * @param trainID
	 * @param routeID
	 * @param time
	 * @throws IOException
	 */
	public void setRouteReserve(String trainID, String routeID, float time) throws IOException {
		String command =  "<setRouteReserve"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				" time=" +"\""+ time+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * cancelRoute: cancel a reservation (if route is not reserved)
	 * @param trainID
	 * @param routeID
	 * @throws IOException
	 */
	public void cancelRoute(String trainID, String routeID) throws IOException {
		String command =  "<cancelRoute"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setMovementAuthority
	 * Movement Authority (MA): A train has a conflict-free run until the end of the actual MA (EoA: 
	 * End of Authority). The train waits for new MA’s to continue its journey, without it stops at the end 
     * of the last received MA (EoA). 
	 * @param trainID
	 * @param routeID: EoA
	 * @param routeOffset: EoA
	 * @throws IOException
	 */
	public void setMovementAuthority(String trainID, String routeID, float routeOffset) throws IOException {
		String command =  "<setMovementAuthority"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				" routeOffset=" +"\""+ routeOffset+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * setMovementAuthority
	 * Movement Authority (MA): A train has a conflict-free run until the end of the actual MA (EoA: 
	 * End of Authority). The train waits for new MA’s to continue its journey, without it stops at the end 
     * of the last received MA (EoA). 
	 * @param trainID
	 * @param routeID: EoA
	 * @param routeOffset: EoA
	 * @param startTime
	 * @param endTime
	 * @throws IOException
	 */
	public void setMovementAuthority(String trainID, String routeID, float routeOffset, float startTime, float endTime) throws IOException {
		String command =  "<setMovementAuthority"+ 
				" trainID=" +"\""+ trainID+"\""+
				" routeID=" +"\""+ routeID+"\""+
				" routeOffset=" +"\""+ routeOffset+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" endTime=" +"\""+ endTime+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * resetMovementAuthority
	 * @param trainID
	 * @param time
	 * @throws IOException
	 */
	public void resetMovementAuthority(String trainID, float time) throws IOException {
		String command =  "<resetMovementAuthority"+ 
				" trainID=" +"\""+ trainID+"\""+
				" time=" +"\""+ time+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * resetMovementAuthority
	 * @param trainID
	 * @throws IOException
	 */
	public void resetMovementAuthority(String trainID) throws IOException {
		String command =  "<resetMovementAuthority"+ 
				" trainID=" +"\""+ trainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param itineraryName5
	 * @param itineraryName6
	 * @param itineraryName7
	 * @param itineraryName8
	 * @param itineraryName9
	 * @param itineraryName10
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 
			String itineraryName5, 
			String itineraryName6, 
			String itineraryName7, 
			String itineraryName8, 
			String itineraryName9, 
			String itineraryName10, 
			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+
				" itineraryName5=" +"\""+ itineraryName5+"\""+
				" itineraryName6=" +"\""+ itineraryName6+"\""+
				" itineraryName7=" +"\""+ itineraryName7+"\""+
				" itineraryName8=" +"\""+ itineraryName8+"\""+
				" itineraryName9=" +"\""+ itineraryName9+"\""+
				" itineraryName10=" +"\""+ itineraryName10+"\""+
				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param itineraryName5
	 * @param itineraryName6
	 * @param itineraryName7
	 * @param itineraryName8
	 * @param itineraryName9
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 
			String itineraryName5, 
			String itineraryName6, 
			String itineraryName7, 
			String itineraryName8, 
			String itineraryName9, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+
				" itineraryName5=" +"\""+ itineraryName5+"\""+
				" itineraryName6=" +"\""+ itineraryName6+"\""+
				" itineraryName7=" +"\""+ itineraryName7+"\""+
				" itineraryName8=" +"\""+ itineraryName8+"\""+
				" itineraryName9=" +"\""+ itineraryName9+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param itineraryName5
	 * @param itineraryName6
	 * @param itineraryName7
	 * @param itineraryName8
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 
			String itineraryName5, 
			String itineraryName6, 
			String itineraryName7, 
			String itineraryName8, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+
				" itineraryName5=" +"\""+ itineraryName5+"\""+
				" itineraryName6=" +"\""+ itineraryName6+"\""+
				" itineraryName7=" +"\""+ itineraryName7+"\""+
				" itineraryName8=" +"\""+ itineraryName8+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param itineraryName5
	 * @param itineraryName6
	 * @param itineraryName7
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 
			String itineraryName5, 
			String itineraryName6, 
			String itineraryName7, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+
				" itineraryName5=" +"\""+ itineraryName5+"\""+
				" itineraryName6=" +"\""+ itineraryName6+"\""+
				" itineraryName7=" +"\""+ itineraryName7+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param itineraryName5
	 * @param itineraryName6
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 
			String itineraryName5, 
			String itineraryName6, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+
				" itineraryName5=" +"\""+ itineraryName5+"\""+
				" itineraryName6=" +"\""+ itineraryName6+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98" 
     * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param itineraryName5
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 
			String itineraryName5, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+
				" itineraryName5=" +"\""+ itineraryName5+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param itineraryName4
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 
			String itineraryName4, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+
				" itineraryName4=" +"\""+ itineraryName4+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param itineraryName3
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 
			String itineraryName3, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+
				" itineraryName3=" +"\""+ itineraryName3+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param itineraryName2
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 
			String itineraryName2, 


			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+
				" itineraryName2=" +"\""+ itineraryName2+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	/**
	 * <h1>addTrain<h1>
	 * 
	 * <h1>Add a new train before a simulation run starts:<h1> 
	 * If the train is added before a simulation run starts (simulation is not running), the new course is 
     * added to the course list in the courses database (Tools -> Courses). Timetable entries in the 
     * timetable database (Tools -> Timetable) are required to start the course later in the simulation run. 
     * Timetable entries can be created using the API or the OpenTrack GUI.  
	 * 
	 * Example: New train "EX_200" 
	 *<p>
	 *addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
	 *addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1"  
	 *addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     *addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     *itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     *performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * <p>
	 * 
	 * <h1>Add a new train during a simulation run:<h1>
	 * If a new train is added during a simulation run, it will not be added to the course list of the courses 
	 * database but immediately prepared for the simulation. It is highly recommended to define a number of 
     * timetable entries before adding the train. Without timetable entries, the train starts running at the 
     * startTime (if defined, otherwise it starts at the actual simulation time) but cannot respect other timing 
     * points along its itinerary.  
     * <p>
     * Example: New train "EX_200" with timetable entries 
     * <p>
     * addTimetableEntry trainID=" EX_200" stationID="STA_A" arrivalTime="31600.0" departureTime="31660.0"  
     * addTimetableEntry trainID=" EX_200" stationID="STA_B" departureTime="31980.0" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_F" dwellTime="30.0" stopFlag="1" 
     * addTimetableEntry trainID=" EX_200" stationID="STA_G" stopFlag="1" 
	 *<p>
     * addTrain trainID="EX_200" rollingStockID="Flirt" trainSpeedType="Commuter"  
     * itineraryName="I:STA_A-STA_G P1" itineraryName2=" I:STA_A-STA_G P2" 
     * performanceFactorOnTime="0.92" performanceFactorDelayed="0.98"
	 * @param trainID
	 * @param rollingStockID
	 * @param trainSpeedType
	 * @param itineraryName
	 * @param creationTime
	 * @param startTime
	 * @param performanceFactorOnTime
	 * @param performanceFactorDelayed
	 * @param enteringSpeed
	 * @param routeReservationType
	 * @param turnroundTrainID
	 * @throws IOException
	 */
	public void addTrain(String trainID, String rollingStockID, String trainSpeedType, String itineraryName, 

			float creationTime, float startTime, float performanceFactorOnTime, float performanceFactorDelayed, 
			float enteringSpeed, String routeReservationType, String turnroundTrainID
			) throws IOException {
		String command =  "<addTrain"+ 
				" trainID=" +"\""+ trainID+"\""+
				" rollingStockID=" +"\""+ rollingStockID+"\""+
				" trainSpeedType=" +"\""+ trainSpeedType+"\""+
				" itineraryName=" +"\""+ itineraryName+"\""+

				" creationTime=" +"\""+ creationTime+"\""+
				" startTime=" +"\""+ startTime+"\""+
				" performanceFactorOnTime=" +"\""+ performanceFactorOnTime+"\""+
				" performanceFactorDelayed=" +"\""+ performanceFactorDelayed+"\""+
				" enteringSpeed=" +"\""+ enteringSpeed+"\""+
				" routeReservationType=" +"\""+ routeReservationType+"\""+
				" turnroundTrainID=" +"\""+ turnroundTrainID+"\""+
				"/>";	
		sender.otHttpRequest(command);
}
	
}
