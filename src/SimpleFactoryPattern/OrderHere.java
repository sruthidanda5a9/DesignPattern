package SimpleFactoryPattern;

public class OrderHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PizzaStore getMyPizza = new PizzaStore("Cheese");
//		getMyPizza.orderPizza();
		
		PizzaStore pizzaMy = new PizzaStore(new PizzaFactory());
		pizzaMy.orderPizza("Cheese");

	}

}
