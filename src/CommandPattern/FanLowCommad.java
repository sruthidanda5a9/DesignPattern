package CommandPattern;

public class FanLowCommad implements Command{
	
	Fan fan;
	String previous;
	
	public FanLowCommad(Fan fan)
	{
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.low();
		fan.setPrevous( "low" );
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (fan.getPrevous().equals("medium")) fan.low();
		if (fan.getPrevous().equals("high")) fan.medium();
		if (fan.getPrevous().equals("low")) fan.hight();
		
	}

}
