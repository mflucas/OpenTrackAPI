package Common;

import java.util.Arrays;
import java.util.List;

/**
 * Ports definition for running the OT API
 * @author Lucas Meyer de Freitas, EBP
 */
public abstract class Constants {
	
	//IS "Keep open" marked in the OTD-Settings in OT?
	public static final boolean KEEP_CONNECTION_OPEN = true;
	
	//RUN FROM BATCH FILE?
	public static final boolean RUN_FROM_BATCHFILE = false;
	
	//START SIMULATION FROM SCRIPT?
	public static final boolean START_FROM_SCRIPT = true;

	//PRINT CONSOLE OUTPUT TO FILE?
	public static final boolean PRINT_TO_FILE = false;

	//DEFINE PORTS
	public static final int OTD_PORT = 9004;
	public static final int OpenTrack_PORT = 9002;

	//DEFINE SIM START AND END TIMES
	public static final int SIM_START_TIME = 7*3600;//8:00
	public static final int SIM_END_TIME = 18*3600;//10:00
	
	//DEFINE DELAY SCENARIO
	public static final int DELAY_SCENARIO = 1;
	
	//ACTIVATE DISPATCHING FROM API?`
	public static final boolean DISPATCHING_ON=false;

	
	//COURSES FOR RULE #1 (IC2 and IC21 from GD to BEL)

    static String[] coursesFromGD = new String[]{
    		"t 651 F J M 80" , 
    		"t 651 F J M 82" , 
    		"t 651 F J M 84" , 
    		"t 651 F J M 86" , 
    		"t 651 F J M 88" , 
    		"t 651 F J M 90" , 
    		"t 651 F J M 92" , 
    		"t 651 F J M 94" , 
    		"t 651 F J M 96" , 
    		"t 851 E J M 116" , 
    		"t 851 E J M 118" , 
    		"t 851 E J M 120" , 
    		"t 851 E J M 122" , 
    		"t 851 E J M 124" , 
    		"t 851 E J M 126" , 
    		"t 851 E J M 128" , 
    		"t 851 E J M 130" , 
    		"t 851 E J M 132" , 
    		"t 851 E J M 134"};
    
    public static final List<String> COURSES_TO_BEL = Arrays.asList(coursesFromGD);

}
