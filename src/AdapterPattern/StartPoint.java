package AdapterPattern;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ok I can communicate with only the classes who implements duck interface but I
		 * would like to talk to turky class.
		 * 
		 * lets see what will happen now. Via adapter class we can provide communciation.
		 */
		
		Duck duck =new DuckClass();
		duck.fly();
		duck.walk();
		
		Turkey turkey = new TurkyClass();
		TurkeyToDuckAdaption adaptedclass = new TurkeyToDuckAdaption(turkey);
		adaptedclass.fly();
		adaptedclass.walk();

	}

}
