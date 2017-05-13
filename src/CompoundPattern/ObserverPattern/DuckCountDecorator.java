package CompoundPattern.ObserverPattern;

public class DuckCountDecorator implements Quackable{
	
	static int count = 0;
	Quackable quck;
	Observable observable;
	
	
	DuckCountDecorator(Quackable quck)
	{
		observable = new Observable(this);
		this.quck = quck;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quck.quack();
		count++;
		notifyObservera();
		
	}
	
	static public int getCount()
	{
		return count;
	}

	@Override
	public void Register(Observer o) {
		// TODO Auto-generated method stub
		observable.Register(o);
		
	}

	@Override
	public void notifyObservera() {
		// TODO Auto-generated method stub
		observable.notifyObservera();
	}
	

}
