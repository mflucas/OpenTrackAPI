package api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import openTracktoOTD.*;
import utils.ClassFinder;
import utilsOTtoJava.OpenTrack;
import utilsOTtoJava.OpenTrackObject;

/**
 * Unmarshall messages from OpenTrack to the OTD server to a Java OpenTrack-Object
 * OpenTrack-Objects are listed as POJO objects in the openTracktoOTD package. 
 * For the unmarshaller to work a case must be defined in the switch in this class.
 * @author Lucas Meyer de Freitas, EBP
 */
public class ConvertorAlwaysOpen {

	OpenTrack convertFromSOAP(String xmlPart) throws IOException, SOAPException, JAXBException {

		try {
			
			String soapPart = xmlPart;

		
		//Print SOAP Message
//		int index = soapPart.indexOf("Body", 0);
//	System.out.println(soapPart.substring(index+6));
		SOAPMessage message = MessageFactory.newInstance().createMessage(null,
				new ByteArrayInputStream(soapPart.getBytes()));
		JAXBContext jaxbContext;

		QName name = getFirstBodyElement(message);
		String localPart = name.getLocalPart();
		
		System.out.println(localPart);


		List<Class<?>> classes = ClassFinder.find("openTracktoOTD");
		String localPartUpperCase = localPart.substring(0, 1).toUpperCase() + localPart.substring(1); //Make it uppercase to match the names of the classes
		String className = new StringBuilder().append("openTracktoOTD.").append(localPartUpperCase).toString();

		if (!classes.toString().contains(className)) {
			return new OpenTrackObject();
		}

		switch (localPart) {
		
		
		case "infraPartEntry": {
			jaxbContext = JAXBContext.newInstance(InfraPartEntry.class);
			break;
		}
		
		case "infraPartExit": {
			jaxbContext = JAXBContext.newInstance(InfraPartExit.class);
			break;
		}
		
		case "infraPartReleased": {
			jaxbContext = JAXBContext.newInstance(InfraPartReleased.class);
			break;
		}
		
		case "infraPartReserved": {
			jaxbContext = JAXBContext.newInstance(InfraPartReserved.class);
			break;
		}
		
		case "routeEntry": {
			jaxbContext = JAXBContext.newInstance(RouteEntry.class);
			break;
		}

		case "routeExit": {
			jaxbContext = JAXBContext.newInstance(RouteExit.class);
			break;
		}

		case "routePartReleased": {
			jaxbContext = JAXBContext.newInstance(RoutePartReleased.class);
			break;
		}
		case "routeReleased": {
			jaxbContext = JAXBContext.newInstance(RouteReleased.class);
			break;
		}

		case "routeReserved": {
			jaxbContext = JAXBContext.newInstance(RouteReserved.class);
			break;
		}
		case "signalPassed": {
			jaxbContext = JAXBContext.newInstance(SignalPassed.class);
			break;
		}

		case "simStarted": {
			jaxbContext = JAXBContext.newInstance(SimStarted.class);
			break;
		}
		
		case "simStopped": {
			jaxbContext = JAXBContext.newInstance(SimStopped.class);
			break;
		}
		
		case "trainArrival": {
			jaxbContext = JAXBContext.newInstance(TrainArrival.class);
			break;
		}

		case "trainCreated": {
			jaxbContext = JAXBContext.newInstance(TrainCreated.class);
			break;
		}
		
		case "trainDeleted": {
			jaxbContext = JAXBContext.newInstance(TrainDeleted.class);
			break;
		}
		
		case "trainDeparture": {
			jaxbContext = JAXBContext.newInstance(TrainDeparture.class);
			break;
		}
		
		case "trainPass": {
			jaxbContext = JAXBContext.newInstance(TrainPass.class);
			break;
		}

		case "trainPositionReport": {
			jaxbContext = JAXBContext.newInstance(TrainPositionReport.class);
			break;
		}
		
		case "trainStopped": {
			jaxbContext = JAXBContext.newInstance(TrainStopped.class);
			break;
		}
		
		default:
			return new OpenTrackObject();
		}

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return (OpenTrack) jaxbUnmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
		} catch (StringIndexOutOfBoundsException e) {
			return new OpenTrackObject();
		}

	}
	
	
	
	
	

	public static QName getFirstBodyElement(final SOAPMessage soapMessage) throws SOAPException {
		QName operationName = null;
		SOAPBody body = soapMessage.getSOAPPart().getEnvelope().getBody();

		if (body != null) {
			Iterator<javax.xml.soap.Node> nodes = body.getChildElements();
			Node node = null;
			while (nodes.hasNext()) {
				node = nodes.next();
				if (node instanceof Element) {
					operationName = new QName(node.getNamespaceURI(), node.getLocalName());
				}
			}
		}

		return operationName;
	}

	// Filter only the SOAP Part of the message
	private static String otXML(String message) {
		String xmlPart = null;
		String completeOTResponse = message;
		int index = completeOTResponse.indexOf("<", 0);
		xmlPart = completeOTResponse.substring(index);
		return xmlPart;

	}

}
