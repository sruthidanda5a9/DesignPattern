package AbstractFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Cheese"))
			pizza = new ChicagoCheesePizza(new ChicagoIngredientFactory());
		else if(type.equals("Greek"))
			pizza = new ChicagoGreekPizza(new ChicagoIngredientFactory());
		else if(type.equals("Pepperoni"))
			pizza = new ChicagoPepperoniPizza(new ChicagoIngredientFactory());
		return pizza;
	}
	

}
