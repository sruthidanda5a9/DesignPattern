package DecoratingPattern;

public class Mocha extends Decorator{
	
	Breverage breverage;
	
	Mocha(Breverage b)
	{
		breverage = b;
	}
	
	public String getDescription()
	{
		return breverage.getDescription() + ", Mocha";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		System.out.println("COST OF MOCHA ADDED 3");
		return 3+ breverage.cost();
	}

}
