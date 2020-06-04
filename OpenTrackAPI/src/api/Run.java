package api;

import java.io.FileOutputStream;
import java.io.PrintStream;
import Common.Constants;


//Main class to run the Simulation with API
public class Run {
	public static void main(String[] args) throws Exception {
		// Print console prints to file
		if (Constants.PRINT_TO_FILE) {
			PrintStream out = new PrintStream(new FileOutputStream("C://Users/lmf/Desktop/test/Output_JAVA.txt", false),
					true);
			System.setOut(out);
		}

		// Start server and start simulation
		Server.otServer();
	}
}