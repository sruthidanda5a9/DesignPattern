package CompoundPattern.FactoryPattern;

public class DuckCountDecorativeFactoryPattern implements AdapaterFactoryPattern{

	@Override
	public Quackable getDuck1() {
		// TODO Auto-generated method stub
		return new DuckCountDecorator(new Duck1());
		
		
	}

	@Override
	public Quackable getDuck2() {
		// TODO Auto-generated method stub
		return new DuckCountDecorator(new Duck2());
	}

	@Override
	public Quackable getDuck3() {
		// TODO Auto-generated method stub
		return new DuckCountDecorator(new Duck3());
		
	}

	@Override
	public Quackable getDuck4() {
		// TODO Auto-generated method stub
		return new DuckCountDecorator(new Duck4());
		
	}

}
