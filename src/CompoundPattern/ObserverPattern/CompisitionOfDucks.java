package CompoundPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompisitionOfDucks implements Quackable {
	
	ArrayList<Quackable> q1 = new ArrayList();
	
	public void add(Quackable q)
	{
		q1.add(q);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = q1.iterator();
		while(iterator.hasNext())
		{
			Quackable q = iterator.next();
			q.quack();
		}
	}

	@Override
	public void Register(Observer o) {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = q1.iterator();
		while(iterator.hasNext())
		{
			Quackable q = iterator.next();
			q.Register(o);
		}
		
	}

	@Override
	public void notifyObservera() {
		// TODO Auto-generated method stub
		
	}
	
}
