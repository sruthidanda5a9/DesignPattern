package AbstractFactoryPattern;

public class SFOPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese"))
			pizza = new SFOCheesePizza(new SFOIngredientFactory());
		else if(type.equals("Greek"))
			pizza = new SFOGreekPizza(new SFOIngredientFactory());
		else if(type.equals("Pepperoni"))
			pizza = new SFOPepperoniPizza(new SFOIngredientFactory());
		return pizza;
	}

}
