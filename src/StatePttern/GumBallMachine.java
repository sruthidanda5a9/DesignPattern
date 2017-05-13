package StatePttern;

public class GumBallMachine {
	
	public static statePattern NO_FUND = new NOFUND(new GumBallMachine());
	public static statePattern HAS_FUND =new HasFund(new GumBallMachine());
	public int count = 0;
	
	public static statePattern state = NO_FUND;
	
	public void setState(statePattern state)
	{
		this.state = state;
	}
	
	
	public statePattern getState()
	{
		return state;
	}
	
	public static void main(String args[])
	{
		state.insertCoin();
		state.ejectCoin();
		state.ejectCoin();
	}

}
