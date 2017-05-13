package StrategyPattern;

public class ModelDuck extends Duck{
	
	public void display()
	{
		System.out.println("I am in modelDuck extends Duck class");
		flyBehavior.fly();
	}

}
