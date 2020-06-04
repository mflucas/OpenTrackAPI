package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO TrainCreated
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "trainCreated")
public class TrainCreated extends OpenTrackObject {
	
	
	private String time;
	
	public TrainCreated() {
		super();
	}
	/**
	 * TrainCreated
	 * @param trainID
	 * @param time
	 */
	public TrainCreated(String trainID, String time) {
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