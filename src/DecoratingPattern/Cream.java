package DecoratingPattern;

public class Cream extends Decorator{

Breverage breverage;
	
	Cream(Breverage b)
	{
		breverage = b;
	}
	
	public String getDescription()
	{
		return breverage.getDescription() + ", Cream";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		System.out.println("cOST OF Cream added 4");
		return 4+ breverage.cost();
	}

}
