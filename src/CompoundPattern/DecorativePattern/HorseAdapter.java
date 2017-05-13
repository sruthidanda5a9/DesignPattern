package CompoundPattern.DecorativePattern;


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

}
