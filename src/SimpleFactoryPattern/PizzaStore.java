package SimpleFactoryPattern;

public class PizzaStore {
	
	Pizza pizza;
	
	PizzaFactory factory;
	
	// need to seperate this object creation from this class to seperate object.
	//public PizzaStore(String type) {
		/*// TODO Auto-generated constructor stub
		if(type.equals("Cheese"))
			pizza = new CheesePizza();
		else if(type.equals("Greek"))
			pizza = new GreekPizza();
		else if(type.equals("Pepperoni"))
			pizza = new PepperoniPizza();*/
	//}
	
	public PizzaStore(PizzaFactory factory)
	{
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type)
	{
		pizza = factory.createPizza(type);
		pizza.bake();
		pizza.create();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
