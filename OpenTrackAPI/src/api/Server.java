package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.xml.stream.XMLInputFactory;
import Common.*;
import apiStreckeTest.*;
//import aGotthardTests.*; //Change here the name of the package for the projects. Names of classes in the package should remain the same
//import aHandleRequestsTeststrecke.*; //Change here the name of the package for the projects. Names of classes in the package should remain the same
import oTDtoOpenTrack.SimController;
import utilsOTtoJava.OpenTrack;


/**
 * Starts OTD server and simulation. 
 * OpenTrack already needs to be running for this class to work. 
 * @author Lucas Meyer de Freitas, EBP
 */
public class Server {
	static Socket socket;
	static XMLInputFactory inputFactory = XMLInputFactory.newInstance();

	public static void otServer() throws IOException {

		// Initialize variables
		RequestHandler handleRequest= new RequestHandler();
		Convertor convertor = new Convertor();
		SimulationPrep.prepareSimulation();
		SimController start = new SimController();
		
		try {

//        	Define the port where it is running 
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(Constants.OTD_PORT);
			System.out.println("Server listening to port " + Constants.OTD_PORT);
			
			if (Constants.RUN_FROM_BATCHFILE) {
				Runtime.getRuntime().exec("cmd /c OT-Gotthard_Delays_50_OTD.bat", null, 
						new File("C:\\OpenTrack Home\\OTProjekte\\213032 Gotthard"));			
				} else {
				if(Constants.START_FROM_SCRIPT) {
					start.startSimulation();
				}
			}
			
			// Server is running always. This is done using this while(true) loop
			while (true) {

				// Reading the message from the client
				socket = serverSocket.accept();
				InputStream is = socket.getInputStream();

				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				
				
				
				// Transform the message from OpenTrack in a java object and pass it to the
				// Handler class
				// The handler class manages what is done with the object
				// Each project with the API has its own package and class
				OpenTrack o = convertor.convertFromSOAP(response.toString());
				
				handleRequest.responseBased(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
			}
		}
	}

}