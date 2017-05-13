package CommandPattern;

public class FanMediumCommad implements Command{
	
	Fan fan;
	
	public FanMediumCommad(Fan fan)
	{
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.medium();
		fan.setPrevous( "medium" );
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (fan.getPrevous().equals("medium")) fan.low();
		if (fan.getPrevous().equals("high")) fan.medium();
		if (fan.getPrevous().equals("low")) fan.hight();;
		
	}

}
