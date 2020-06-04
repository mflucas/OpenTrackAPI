package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO RoutePartReleased
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "routePartReleased")
public class RoutePartReleased extends OpenTrackObject {
	
	private String routeID;
	private String partID;
	private String time;

	
	public RoutePartReleased() {
		super();
	}
	
		/**
		 * RoutePartReleased
		 * @param trainID
		 * @param routeID
		 * @param partID
		 * @param time
		 */
	public RoutePartReleased(String trainID, String routeID, String partID,String time) {
		super(trainID);
		this.setRouteID(routeID);
		this.setPartID(partID);
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

	@XmlAttribute(name= "partID")
	public String getPartID() {
		return partID;
	}

	public void setPartID(String partID) {
		this.partID = partID;
	}
	
	@Override
	public String  toString() {
		return super.toString() + "\nRouteID: " + getRouteID();
	}
	
}
