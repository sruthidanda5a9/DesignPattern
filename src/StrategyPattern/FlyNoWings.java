package StrategyPattern;

/*
 * FlyNoWings is one class which implements flyBehavior. 
 *Here the method implementation is different from the classes who implement Fly behavior.
 */
public class FlyNoWings implements FlyBehavior{
	public void fly()
	{
		System.out.println("I am Fly in Fly no wings");
	}

}
