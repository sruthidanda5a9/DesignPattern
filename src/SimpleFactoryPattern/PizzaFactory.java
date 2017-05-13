package SimpleFactoryPattern;

public class PizzaFactory {
	
	Pizza pizza;
	public Pizza createPizza(String type)
	{
		if(type.equals("Cheese"))
			pizza = new CheesePizza();
		else if(type.equals("Greek"))
			pizza = new GreekPizza();
		else if(type.equals("Pepperoni"))
			pizza = new PepperoniPizza();
		return pizza;
	}

}
