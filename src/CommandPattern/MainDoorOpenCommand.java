package CommandPattern;

public class MainDoorOpenCommand implements Command{
	
	Door door;
	SimpleDoorFactory factory = new SimpleDoorFactory();
	public MainDoorOpenCommand(String string)
	{
		door  = factory.getInstance(string);
	}

	@Override
	public void execute() {
		if(door != null)
			door.open();
	}

	@Override
	public void undo() {
		if(door != null)
			door.close();
		
	}
	

}
