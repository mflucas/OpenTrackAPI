package openTracktoOTD;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import utilsOTtoJava.OpenTrackObject;

/**
 * POJO SignalPassed
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "signalPassed")
public class SignalPassed extends OpenTrackObject{
	
private String signalID;
private String signalType;
private String routeID;
private String signalAspectMain;
private String signalAspectDistant;
private String time;

public SignalPassed() {
	super();
}
/**
 * SignalPassed
 * @param trainID
 * @param signalID
 * @param signalType
 * @param routeID
 * @param signalAspectMain
 * @param signalAspectDistant
 * @param time
 */
public SignalPassed(String trainID, String signalID, String signalType, String routeID, String signalAspectMain, String signalAspectDistant, String time)
{
	super(trainID);
	this.setSignalID(signalID);
	this.setSignalType(signalType);
	this.setRouteID(routeID);
	this.setSignalAspectDistant(signalAspectDistant);
	this.setSignalAspectMain(signalAspectMain);
	this.setTime(time);

}



@XmlAttribute(name= "signalID")
public String getSignalID() {
	return signalID;
}

public void setSignalID(String signalID) {
	this.signalID = signalID;
}

@XmlAttribute(name= "signalType")
public String getSignalType() {
	return signalType;
}

public void setSignalType(String signalType) {
	this.signalType = signalType;
}

@XmlAttribute(name= "routeID")
public String getRouteID() {
	return routeID;
}

public void setRouteID(String routeID) {
	this.routeID = routeID;
}

@XmlAttribute(name= "signalAspectMain")
public String getSignalAspectMain() {
	return signalAspectMain;
}

public void setSignalAspectMain(String signalAspectMain) {
	this.signalAspectMain = signalAspectMain;
}

@XmlAttribute(name= "signalAspectDistant")
public String getSignalAspectDistant() {
	return signalAspectDistant;
}

public void setSignalAspectDistant(String signalAspectDistant) {
	this.signalAspectDistant = signalAspectDistant;
}

@XmlAttribute(name= "time")
public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

@Override
public String  toString() {
	return super.toString() + "\nRouteID: " + getRouteID();
}


}
