package CompoundPattern.ObserverPattern;


public class HorseAdapter implements Quackable{
	
	Horse1 horse;
	
	public HorseAdapter(Horse1 horse) {
		// TODO Auto-generated constructor stub
		this.horse = horse;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		horse.horseSaysHai();
		
	}

	@Override
	public void Register(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservera() {
		// TODO Auto-generated method stub
		
	}

}
