package StrategyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		/* we are creating reference to MallardDuck of type Duck so 
		 * only the methods which are in Duck class are able to be retried 
		 * using mallardDuck reference.
		 * 
		 * If the method in Duck which you are trying to is overridden in MallardDuck
		 * then the overridden method in child class is accessed.
		 * */
		 
		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		mallardDuck.swim(); // if the we don't have the swim method overridden in mallardDuck class the swim from Duck will be called.

		
		Duck model = new ModelDuck();
		//model.performFly();
		model.setFlyBehavior(new FlyWings());
		model.performFly();;
	}
}
