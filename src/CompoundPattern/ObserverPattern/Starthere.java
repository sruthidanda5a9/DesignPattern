package CompoundPattern.ObserverPattern;


public class Starthere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdapaterFactoryPattern factory = new DuckCountDecorativeFactoryPattern();
		
		CompisitionOfDucks duckCompisition = new CompisitionOfDucks();
		Quackable d1 = factory.getDuck1();
		Quackable d2 =factory.getDuck2();
		Quackable d3 = factory.getDuck3();
		Quackable d4 = factory.getDuck4();
		Quackable horse = new HorseAdapter(new Horse1());
		
		
		
		System.out.println(DuckCountDecorator.getCount());
		
		duckCompisition.add(d1);
		duckCompisition.add(d2);
		duckCompisition.add(d3);
		duckCompisition.add(d4);
		
		Quacklogist getUpate = new Quacklogist();
		duckCompisition.Register(getUpate);
		
		doQuck(duckCompisition);
		doQuck(horse);
		System.out.println(DuckCountDecorator.getCount());
	}
	
	public static void doQuck(Quackable q)
	{
		q.quack();
	}

}
