package TemplatePattern;

public abstract class BreveragePreparation {
	
	final void prepareDrink()
	{
		boilWater();
		brew();
		pourInCup();
		if (needCondiments()){
		addCondiments();
		}
	}


	public   abstract  void addCondiments() ;

	public abstract void brew() ;

	 boolean needCondiments() {
		// TODO Auto-generated method stub
		return false;
	}

	private void pourInCup() {
		System.out.println("POUR IN CUP");
	}

	private void boilWater() {
		System.out.println("BoilWhat");
	}

}
