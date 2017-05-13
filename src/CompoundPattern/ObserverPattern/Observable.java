package CompoundPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackableObservable{
	
	ArrayList observers = new ArrayList();
	
	QuackableObservable Q;
	
	public   Observable(QuackableObservable q) {
		// TODO Auto-generated constructor stub
		this.Q = q;
	}

	@Override
	public void Register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void notifyObservera() {
		// TODO Auto-generated method stub
		
		Iterator I = observers.iterator();
		while(I.hasNext())
		{
			Observer ob = (Observer) I.next();
			ob.update(Q);
		}
		
	}

}
