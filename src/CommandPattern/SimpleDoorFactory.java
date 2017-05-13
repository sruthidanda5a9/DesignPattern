package CommandPattern;

public class SimpleDoorFactory {
	
	public Door getInstance(String door)
	{
		if (door.equals("Main")) return new MainDoor();
		if (door.equals("Garage")) return new GarageDoor();
		if(door.equals("Back")) return new BackYardDoor();
		return null;
		
	}

}
