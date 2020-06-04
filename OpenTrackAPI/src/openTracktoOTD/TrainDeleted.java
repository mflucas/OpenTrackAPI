package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO TrainDeleted
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "trainDeleted")
public class TrainDeleted extends OpenTrackObject {
	
	
	private String time;
	
	public TrainDeleted() {
		super();
	}
	/**
	 * TrainDeleted
	 * @param trainID
	 * @param time
	 */
	public TrainDeleted(String trainID, String time) {
		super(trainID);
		this.setTime(time);

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
		return super.toString();
	}
}