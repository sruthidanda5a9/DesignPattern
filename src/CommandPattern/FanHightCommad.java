package CommandPattern;

public class FanHightCommad implements Command{
	
	Fan fan;
	String previous;
	
	public FanHightCommad(Fan fan)
	{
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.hight();
		fan.setPrevous("high");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (fan.getPrevous().equals("medium")) fan.low();
		if (fan.getPrevous().equals("high")) fan.medium();
		if (fan.getPrevous().equals("low")) fan.hight();
		
	}

}
