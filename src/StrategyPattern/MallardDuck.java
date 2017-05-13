package StrategyPattern;

public class MallardDuck extends Duck{

	@Override
	public void display() {
		System.out.println("I am in disaply of mallradduck which has fly and quack behaviou");
		
	}
	
	// This duck is having fly and quack behaviors so this is using that objects.
	public MallardDuck()
	{
		flyBehavior = new FlyWings();
		quackBehavior = new MuteQuack();
	}
	
	public void methodSpecificToMallardDuck()
	{
		System.out.println("I am in Mallared duck");
		flyBehavior.fly();
		quackBehavior.quack();
	}
}
