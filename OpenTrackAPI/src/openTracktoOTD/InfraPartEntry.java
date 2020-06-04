package openTracktoOTD;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import utilsOTtoJava.OpenTrackObject;
/**
 * POJO InfraPartExit
 * @author Lucas Meyer de Freitas, EBP
 */
@XmlRootElement (name= "infraPartEntry")
public class InfraPartEntry extends OpenTrackObject {
	
	
	private String infraPartID;
	private String time;
	
	public InfraPartEntry() {
		super();
	}
	/**
	 * InfraPartEntry
	 * @param trainID
	 * @param infraPartID
	 * @param time
	 */
	public InfraPartEntry(String trainID, String infraPartID, String time) {
		super(trainID);
		this.setTime(time);
		this.setInfraPartID(infraPartID);

	}
	
	@XmlAttribute(name= "infraPartID")
	public String getInfraPartID() {
		return infraPartID;
	}

	public void setInfraPartID(String infraPartID) {
		this.infraPartID = infraPartID;
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
		return super.toString() ;
	}

}
