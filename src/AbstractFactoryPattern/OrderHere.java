package AbstractFactoryPattern;

public class OrderHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PizzaStore getMyPizza = new PizzaStore("Cheese");
//		getMyPizza.orderPizza();
		
		PizzaStore pizzaMy = new ChicagoPizzaStore();
		pizzaMy.orderPizza("Cheese");

	}

}
