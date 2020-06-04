package oTDtoOpenTrack;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import Common.Constants;

/**
 * Sends a request to the OpenTrack Server
 * This can be done with a Marshaller class (from Java object) with the CommandSender method or
 * By directly passing a String with the XML root element with its attributes (otHttpRequest method) 
 * @author Lucas Meyer de Freitas, EBP
 */
public class Sender  {

	public Sender() {

	}

	/**
	 * Pass OpenTrackObject (must be listed within the switch in the method) 
	 * to be marshalled and then sent to the OpenTrack server
	 * @param object
	 * @throws IOException
	 * @throws JAXBException
	 */
		/**
		 * Pass simple String object containing a command to OpenTrack
		 * RootElementName Attribute1="Value1" Attribute2="Value2" ...
		 * @param xmlPart
		 * @throws IOException
		 */
		public void otHttpRequest(String xmlPart) throws IOException {
			
		
		
		String xmldata = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<SOAP-ENV:Body>" +

			xmlPart +
				"</SOAP-ENV:Body>" + "</SOAP-ENV:Envelope>";

		System.out.println("____________________________________________\n"+
							"Message to OpenTrack: \n"+ xmlPart);
		
		String OTport = Integer.toString(Constants.OpenTrack_PORT);
		
		URL oURL = new URL("http://localhost:"+OTport+"/otd");
		HttpURLConnection con = (HttpURLConnection) oURL.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "OpenTrackDispatcher");
		con.setRequestProperty("Host", "localhost:"+OTport);
		con.setRequestProperty("Content-Length",  Integer.toString(xmldata.getBytes().length));
		con.setRequestProperty("Connection", "Close");
		
		con.setDoOutput(true);
		OutputStream reqStream = con.getOutputStream();
		reqStream.write(xmldata.getBytes());		
		reqStream.close();
		

		//For some reason the request is only sent if the code below is here
		//________________________________________________________________________________________
		System.out.println("_________________________________________________________________________________________\n");
		System.out.println(con.getHeaderField(0).toString());
		System.out.println(con.getHeaderField(1).toString());
		System.out.println(con.getHeaderField(2).toString());
		System.out.println(con.getHeaderField(3).toString());
		System.out.println("_________________________________________________________________________________________\n");
		//________________________________________________________________________________________
		}
		
}