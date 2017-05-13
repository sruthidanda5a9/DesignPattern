package FactoryMethod;

public abstract class PizzaStore {
	
	Pizza pizza;
	
	public Pizza orderPizza(String type)
	{
		pizza = createPizza(type);
		pizza.bake();
		pizza.create();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public  abstract Pizza createPizza(String type);
}
