package StatePttern;

public class NOFUND extends statePattern{
	
	GumBallMachine gum;
	

	public NOFUND(GumBallMachine gum2) {
		// TODO Auto-generated constructor stub
		this.gum = gum2;
	}

	@Override
	public void insertCoin() {
		System.out.println("Insert success");
		gum.setState(new HasFund(gum));
	}

	@Override
	public void ejectCoin() {
		// TODO Auto-generated method stub
		System.out.println("Please insert coin");
		
	}

	@Override
	public void getGum() {
		// TODO Auto-generated method stub
		System.out.println("Wait we are giving you gum");
		
	}

}
