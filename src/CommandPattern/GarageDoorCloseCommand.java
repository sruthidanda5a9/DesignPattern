package CommandPattern;

public class GarageDoorCloseCommand implements Command{
	
	Door door;
	SimpleDoorFactory factory = new SimpleDoorFactory();
	public GarageDoorCloseCommand(String string)
	{
		door  = factory.getInstance(string);
	}

	@Override
	public void execute() {
		if(door != null)
			door.close();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(door != null)
			door.open();
		
	}
	

}
