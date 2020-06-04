package openTracktoOTD;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import utilsOTtoJava.OpenTrackObject;

/**
 * POJO SimStarted
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "simStarted")
public class SimStarted extends OpenTrackObject {
	
	
	private String time;
	
	public SimStarted() {
	}
	
	public SimStarted(String time) {
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
