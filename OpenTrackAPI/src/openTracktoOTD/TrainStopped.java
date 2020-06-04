package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO TrainStopped
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "trainStopped")
public class TrainStopped extends OpenTrackObject{

	private String routeID;
	private String routeOffset;
	private String stopType;
	private String time;

	public TrainStopped() {
		super();
	}
	/**
	 * TrainStopped
	 * @param trainID
	 * @param routeID
	 * @param routeOffset
	 * @param time
	 * @param stopType
	 */
	public TrainStopped(String trainID, String routeID, String routeOffset, String time, String stopType) {
		super(trainID);
		this.setRouteID(routeID);
		this.setTime(routeOffset);
		this.setTime(stopType);

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
	
	@XmlAttribute(name= "routeOffset")
	public String getRouteOffset() {
		return routeOffset;
	}

	public void setRouteOffset(String routeOffset) {
		this.routeOffset = routeOffset;
	}
	
	@XmlAttribute(name= "stopType")
	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}


	@Override
	public String  toString() {
		return super.toString() + "\nRouteID: " + getRouteID();
	}


}
