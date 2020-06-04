package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO TrainPositionReport
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "trainPositionReport")
public class TrainPositionReport extends OpenTrackObject{

	private String routeID;
	private String routeOffset;
	private String delay;
	private String speed;
	private String acceleration;
	private String time;

	public TrainPositionReport() {
		super();
	}
	/**
	 * TrainPositionReport
	 * @param trainID
	 * @param routeID
	 * @param routeOffset
	 * @param time
	 * @param delay
	 * @param speed
	 * @param acceleration
	 */
	public TrainPositionReport(String trainID, String routeID, String routeOffset, String time, String delay, String speed, String acceleration) {
		super(trainID);
		this.setRouteID(routeID);
		this.setTime(routeOffset);
		this.setTime(delay);
		this.setTime(speed);
		this.setTime(acceleration);

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

	@XmlAttribute(name= "delay")
	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	@XmlAttribute(name= "speed")
	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@XmlAttribute(name= "acceleration")
	public String getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	
	
	@Override
	public String  toString() {
		return super.toString() + "\nRouteID: " + getRouteID();
	}

}
