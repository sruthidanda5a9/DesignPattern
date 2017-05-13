package DecoratingPattern;

public class PrepareYourCoffee {
	
	public static void main(String args[])
	{
		/*
		 * Here we are wrapping on object with another i.e wrapping coffee with
		 * condiments.(milk, soya, sauce).
		 */
		Breverage b = new HouseBlend();
		b = new Mocha(b);
		b = new Cream(b);
		System.out.println(b.getDescription());
		System.out.println(b.cost());
	}

}
