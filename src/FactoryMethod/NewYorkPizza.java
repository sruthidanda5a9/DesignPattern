package FactoryMethod;

public class NewYorkPizza extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese"))
			pizza = new NYCheesePizza();
		else if(type.equals("Greek"))
			pizza = new NYGreekPizza();
		else if(type.equals("Pepperoni"))
			pizza = new NYPepperoniPizza();
		return pizza;
	}
	

}
