package openTracktoOTD;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import utilsOTtoJava.OpenTrackObject;

/**
 * POJO SimStarted
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "ping")
public class Ping extends OpenTrackObject {
	
	
	private String time;
	
	public Ping() {
	}
	
	public Ping(String time) {
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