package utilsOTtoJava;
/**
 * Super class for OpenTrack objects, eg. messages from OpenTrack to OTD
 * @author Lucas Meyer de Freitas, EBP
 */
public class OpenTrack {
	
	@Override
	public String  toString() {
		return "---------------------------------\nType: " + getClass().getName();
	}

}
