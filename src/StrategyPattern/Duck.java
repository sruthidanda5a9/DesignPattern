package StrategyPattern;
/*
 * Duck is the abstract parent class which is extended by different types of ducks.
 */
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim()
	{
		System.out.println("This is swim in Duck class");
	}
	
	/*
	 * in order to dynamically use the  fly class which is implemented by Fly we are using set method.
	 */
	public void setFlyBehavior(FlyBehavior flyB)
	{
		flyBehavior = flyB;
	}
	
	public void setQuackBehavior(QuackBehavior quackB)
	{
		quackBehavior = quackB;
	}
}
