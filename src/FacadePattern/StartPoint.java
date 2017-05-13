package FacadePattern;

public class StartPoint {
	
	public static void main(String args[])
	{
		/*
		 * I would like to say hi to everyone but lazy to call every method. 
		 * 
		 * better if we have class that simplifies my task.
		 * 
		 * here I am facade class.
		 */
		
		ClassOne one = new ClassOne();
		ClassTwo two = new ClassTwo();
		ClassThree three = new ClassThree(); Classfour four = new Classfour();
		
		FacadClass faced = new FacadClass(one, two, three, four);
		faced.sayHello();
		
		
		/*
		 * insteda of calling....>
		 * 
		 * one.sayHello();
		two.sayHello();
		three.sayHello();
		four.sayHello();
		
		simply pass all the objects to me i will do it for you.
		 */
	}

}
