package CommandPattern;

public class LightsOnCommand implements Command{
	
	Light light;
	public LightsOnCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}
	

}
