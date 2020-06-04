package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO TrainDeparture
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "trainDeparture")
public class TrainDeparture extends OpenTrackObject {
	
	private String routeID;
	private String stationID;
	private String time;
	private String delay;

	
	public TrainDeparture() {
		super();
	}
	
		/**
		 * TrainDeparture
		 * @param trainID
		 * @param stationID
		 * @param delay
		 * @param time
		 */
	public TrainDeparture(String trainID, String stationID, String delay,String time) {
		super(trainID);
		this.setRouteID(routeID);
		this.setStationID(stationID);
		this.setTime(time);
		this.setTime(delay);
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

	
	@XmlAttribute(name= "stationID")
	public String getStationID() {
		return stationID;
	}


	public void setStationID(String stationID) {
		this.stationID = stationID;
	}

	@XmlAttribute(name= "delay")
	public String getDelay() {
		return delay;
	}


	public void setDelay(String delay) {
		this.delay = delay;
	}	
	
	
	@Override
	public String  toString() {
		return super.toString() + "\nRouteID: " + getRouteID();
	}
	
}