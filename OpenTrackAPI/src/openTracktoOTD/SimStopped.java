package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO SimStopped
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "simStopped")
public class SimStopped extends OpenTrackObject {
	
	
	private String time;
	
	public SimStopped() {
	}
	
	public SimStopped(String time) {
		this.setTime(time);

	}
	
	@XmlAttribute(name= "time")
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}