package FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Cheese"))
			pizza = new ChicagoCheesePizza();
		else if(type.equals("Greek"))
			pizza = new ChicagoGreekPizza();
		else if(type.equals("Pepperoni"))
			pizza = new ChicagoPepperoniPizza();
		return pizza;
	}
	

}
