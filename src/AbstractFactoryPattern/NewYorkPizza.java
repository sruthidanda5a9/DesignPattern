package AbstractFactoryPattern;

public class NewYorkPizza extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese"))
			pizza = new NYCheesePizza(new NYngredientFactory());
		else if(type.equals("Greek"))
			pizza = new NYGreekPizza(new NYngredientFactory());
		else if(type.equals("Pepperoni"))
			pizza = new NYPepperoniPizza(new NYngredientFactory());
		return pizza;
	}
	

}
