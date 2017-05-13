package withoutStatePttern;

public class GumBallMachine {

	private String NO_FUND = "NOFUND";
	private String HAS_FUND ="HASFUND";
	private String SOLD = "GUMSOLD";
	private String NOGUM ="NOGUM";
	public int count = 0;
	
	public String state = NO_FUND;
	
	GumBallMachine(int count){
		this.count = count;
	}
	
	public void insertCoin()
	{
		if (state.equals(NO_FUND))
		{
			System.out.println("inserting coin success");
			state = HAS_FUND;
		}
		else if(state.equalsIgnoreCase(HAS_FUND))
			System.out.println("Please wait you aleady inserted coin");
		else if (state.equals(SOLD))
			System.out.println("please wait we are giving you the gum");
		else if (state.equals(NOGUM))
			System.out.println("we are sorry");
	}
	
	public void ejectCoin()
	{
		if (state.equals(NO_FUND))
		{
			System.out.println("Please insert coin coin before ejecting..");
		}
		else if(state.equalsIgnoreCase(HAS_FUND))
		{
			System.out.println("coin ejected");
			state = NO_FUND;
		}
		else if (state.equals(SOLD))
			System.out.println("please wait we are giving you the gum");
		else if (state.equals(NOGUM))
			System.out.println("we are sorry");
	}
	
	public void getGum()
	{
		if (state.equals(NO_FUND))
		{
			System.out.println("Please insert coin coin before trying to get gum..");
		}
		else if(state.equalsIgnoreCase(HAS_FUND))
		{
			state = SOLD;
			System.out.println("giving gum");
			count--;
		}
		else if (state.equals(SOLD))
			System.out.println("please wait we are giving you the gum");
		else if (state.equals(NOGUM))
			System.out.println("we are sorry");
	}

}
