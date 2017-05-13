package CompoundPattern.DecorativePattern;


public class Starthere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Hey here we are using stretagy pattern to add qauck behaviour to ducks.
		 */
		
		Quackable d1 = new DuckCountDecorator(new Duck1());
		Quackable d2 =new DuckCountDecorator( new Duck2());
		Quackable d3 = new DuckCountDecorator(new Duck3());
		Quackable d4 = new DuckCountDecorator(new Duck4());
		Quackable horse = new HorseAdapter(new Horse1());
		
		System.out.println(DuckCountDecorator.getCount());
		
		d1.quack();
		d2.quack();
		d3.quack();
		d4.quack();
		horse.quack();
		System.out.println(DuckCountDecorator.getCount());
	}

}
