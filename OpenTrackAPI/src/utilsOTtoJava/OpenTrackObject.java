package utilsOTtoJava;


import javax.xml.bind.annotation.XmlAttribute;

/**
 * Super class for OpenTrack objects, eg. messages from OpenTrack to OTD
 * @author Lucas Meyer de Freitas, EBP
 */
public class OpenTrackObject extends OpenTrack {
	
	protected String trainID;
	
	public OpenTrackObject() {	
	}
	
	public OpenTrackObject(String trainID) {
		
		this.setTrainID(trainID);
	}

	@XmlAttribute(name= "trainID")
	public String getTrainID() {
		return trainID;
	}
	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}

	
	@Override
	public String  toString() {
		return super.toString() + "\nTrainID: " + getTrainID();
	}
}
