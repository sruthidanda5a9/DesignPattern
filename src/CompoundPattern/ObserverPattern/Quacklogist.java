package CompoundPattern.ObserverPattern;

public class Quacklogist implements Observer{

	@Override
	public void update(QuackableObservable quack) {
		// TODO Auto-generated method stub
		System.out.println("The duck qucked i got this update from observer patetrn" + quack);
		
	}

}
