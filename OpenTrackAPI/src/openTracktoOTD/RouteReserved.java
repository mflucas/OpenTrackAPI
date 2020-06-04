package openTracktoOTD;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import utilsOTtoJava.OpenTrackObject;

/**
 * POJO RouteReserved
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "routeReserved")
public class RouteReserved extends OpenTrackObject {
	
	
	private String routeID;
	private String time;
	
	public RouteReserved() {
		super();
	}
	/**
	 * RouteReserved
	 * @param trainID
	 * @param routeID
	 * @param time
	 */
	public RouteReserved(String trainID, String routeID, String time) {
		super(trainID);
		this.setRouteID(routeID);
		this.setTime(time);

	}
	

	@XmlAttribute(name= "routeID")
	public String getRouteID() {
		return routeID;
	}
	public void setRouteID(String routeID) {
		this.routeID = routeID;
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
