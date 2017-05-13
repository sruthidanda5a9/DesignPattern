package FacadePattern;

public class FacadClass {
	
	ClassOne one;
	ClassTwo two ;
	ClassThree three; Classfour four;
	
	FacadClass(ClassOne one, ClassTwo two , ClassThree three, Classfour four)
	{
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
	}
	
	public void sayHello()
	{
		one.sayHello();
		two.sayHello();
		three.sayHello();
		four.sayHello();
	}

}
