package withoutStatePttern;

public class StartHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GumBallMachine gum = new  GumBallMachine(5);
		gum.insertCoin();System.out.println(gum.state);
		gum.insertCoin();System.out.println(gum.state);
		

	}

}
