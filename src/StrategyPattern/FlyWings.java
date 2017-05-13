package StrategyPattern;

/*
 * FlyWings is one class which implements flyBehavior. 
 *Here the method implementation is different from the classes who implement Fly behavior.
 */
public class FlyWings implements FlyBehavior{
  public void fly(){
	  System.out.println("I am fly in Flywings");
  }
}
