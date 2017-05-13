package CommandPattern;

public class RemoteControllerLoader {

	public static void main(String[] args) {
		
		/*
		 * The following are the steps to perform the lightOn and light off commad.
		 */
		
		Command undoCommad;
		Light light = new Light();
		LightsOnCommand lightOn = new LightsOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		RemoteController controlerLightOn = new RemoteController(lightOn);
		undoCommad = lightOn;
		controlerLightOn.buttonPressed();
		
		RemoteController controlerLightOff = new RemoteController(lightOff);
		undoCommad = lightOff;
		controlerLightOff.buttonPressed();
		
		/* Until now we have only one light we are totally fine lets open door and we have 
		 * different kind of doors.1. garage 2. main door 3. backyard.
		 * 
		 * Lets use interface to create the door and is implemented by different types of door
		 * 
		 * but we have to create the command object for each and every action.
		 */
		
		
		MainDoorOpenCommand mainopenDoor = new MainDoorOpenCommand("Main");
		RemoteController mainopenDoorController = new RemoteController(mainopenDoor);
		undoCommad = mainopenDoor;
		mainopenDoorController.buttonPressed();
		
		GarageDoorCloseCommand  garageDoorClose = new GarageDoorCloseCommand("Garage");
		RemoteController garagecloseDoorController = new RemoteController(garageDoorClose);
		undoCommad = garageDoorClose;
		garagecloseDoorController.buttonPressed();
		
		undoCommad.undo();
		
		Fan fan = new Fan();
		FanLowCommad fanLow = new FanLowCommad(fan);
		RemoteController fanLowController = new RemoteController(fanLow);
		fanLowController.buttonPressed();
		
		undoCommad = fanLow;
		undoCommad.undo();
		

		FanMediumCommad fanmedium = new FanMediumCommad(fan);
		RemoteController fanMediumController = new RemoteController(fanmedium);
		fanMediumController.buttonPressed();
		
		undoCommad = fanmedium;
		undoCommad.undo();
	}

}
