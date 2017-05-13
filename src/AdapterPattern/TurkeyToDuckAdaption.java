package AdapterPattern;

/*
 * Here we are simply converting turkey to duck but for the outside work they look turky as duck 
 * since the adapter class is implementing the duck.
 */
public class TurkeyToDuckAdaption implements Duck{
	
	Turkey turky;
	
	TurkeyToDuckAdaption(Turkey turky)
	{
		this.turky = turky;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turky.fly();
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		turky.walk();
		
	}

}
