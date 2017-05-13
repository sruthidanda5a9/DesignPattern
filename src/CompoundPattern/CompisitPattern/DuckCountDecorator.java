package CompoundPattern.CompisitPattern;


public class DuckCountDecorator implements Quackable{
	
	static int count = 0;
	Quackable quck;
	
	DuckCountDecorator(Quackable quck)
	{
		this.quck = quck;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quck.quack();
		count++;
		
	}
	
	static public int getCount()
	{
		return count;
	}
	

}
