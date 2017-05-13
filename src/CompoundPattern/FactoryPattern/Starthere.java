package CompoundPattern.FactoryPattern;

import CompoundPattern.CompisitPattern.AdapaterFactoryPattern;
import CompoundPattern.CompisitPattern.DuckCountDecorativeFactoryPattern;
import CompoundPattern.CompisitPattern.DuckCountDecorator;
import CompoundPattern.CompisitPattern.Horse1;
import CompoundPattern.CompisitPattern.HorseAdapter;
import CompoundPattern.CompisitPattern.Quackable;

public class Starthere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdapaterFactoryPattern factory = new DuckCountDecorativeFactoryPattern();
		Quackable d1 = factory.getDuck1();
		Quackable d2 =factory.getDuck2();
		Quackable d3 = factory.getDuck3();
		Quackable d4 = factory.getDuck4();
		Quackable horse = new HorseAdapter(new Horse1());
		
		System.out.println(DuckCountDecorator.getCount());
		
		
		
		doQuck(d1);
		doQuck(d2);
		doQuck(d3);
		doQuck(d4);
		doQuck(horse);
		System.out.println(DuckCountDecorator.getCount());
	}
	
	public static void doQuck(Quackable q)
	{
		q.quack();
	}

}
