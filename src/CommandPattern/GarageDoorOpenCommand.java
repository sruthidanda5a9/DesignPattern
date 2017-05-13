package CommandPattern;

public class GarageDoorOpenCommand implements Command{
	
	Door door;
	SimpleDoorFactory factory = new SimpleDoorFactory();
	public GarageDoorOpenCommand(String string)
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
		// TODO Auto-generated method stub
		if(door != null)
			door.close();
		
	}
	

}
