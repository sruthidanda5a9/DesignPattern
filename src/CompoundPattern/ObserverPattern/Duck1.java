package CompoundPattern.ObserverPattern;

public class Duck1 implements Quackable{
	
	Observable observable;
	
	Duck1()
	{
		observable = new Observable(this) ;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am duck1 quack method.");
		notifyObservera();
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
