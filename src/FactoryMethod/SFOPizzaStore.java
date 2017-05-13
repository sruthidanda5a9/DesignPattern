package FactoryMethod;

public class SFOPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese"))
			pizza = new SFOCheesePizza();
		else if(type.equals("Greek"))
			pizza = new SFOGreekPizza();
		else if(type.equals("Pepperoni"))
			pizza = new SFOPepperoniPizza();
		return pizza;
	}

}
