package StatePttern;

public class HasFund extends statePattern{
	
	GumBallMachine gum ;

	public HasFund(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		
		this.gum = gumBallMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("Please wait we already have coin with us");
	}

	@Override
	public void ejectCoin() {
		// TODO Auto-generated method stub
		if (gum.getState() instanceof HasFund)
		System.out.println("Coin ejected");
		else {
			System.out.println("coin can not be ejected");
		}
		
	}

	@Override
	public void getGum() {
		// TODO Auto-generated method stub
		System.out.println("giving gum");
		
	}
	

}
