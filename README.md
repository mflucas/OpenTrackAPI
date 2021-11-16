# OpenTrackAPI
OpenTrack-API client implementation in Java by Lucas Meyer de Freitas written at EBP Schweiz AG. 
This implementation contains all SOAP-messages allowed to be sent to OpenTrack as well as all messages that can be sent
to the client implemented in OpenTrack at the time of writing. For an overview of the OpenTrack-API see: 
[OpenTrack-API](http://www.opentrack.ch/opentrack/opentrack_e/api/opentrack_api_e.html)

If using the OpenTrack-API it is highly recommendable to read the OpenTrack-API Manual provided together with the OpenTrack-API license.

## Structure of the classes
The structure of the available classes is given in the overview below. Red classes should not be changed and just provide the methods to read and send messages between the client and OpenTrack. Green classes should be adapted at a project specific basis: 

![ImageInfo](https://github.com/mflucas/OpenTrackAPI/blob/master/Images/Structure.PNG)

### Preparing a simulation
To prepare a simulation the class SimulationPrep.java should be adapted. This class contains the simulationController which defines start and end times of the simulation which are defined separately in the Constants class. Further parameters can be extended though according to the OpenTrack-API manual. 

### Running a simulation
While running a simulation, any dynamic reactions from the simulation, be it just reading outputs from OpenTrack or sending messages to trains during an OpenTrack simulation, all is coordinated from the RequestHandler.java class. 

## Messages 
### Messages to OpenTrack
All possible messages are methods within the Sender (messages to trains) and SimController (messages to the simulation management in OpenTrack).

### Messages from OpenTrack
Here each possible message is a separate class as in the image above. 

## Convertor 
**IMPORTANT:** The updated version has, additionally than the image above a ConvertorAlwaysOpen.java and a ServerAlwaysOpen.java class. 
These two classes are to be used when the "Keep connection open" option is marked in the OpenTrack-API check box. This configuration is recommended for large-scale simulations. 
To switch between the open connection and the standard module change the **KEEP_CONNECTION_OPEN** variable in the Constants.java class between true or false. 
