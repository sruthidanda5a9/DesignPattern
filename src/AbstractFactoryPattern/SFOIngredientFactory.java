package AbstractFactoryPattern;

public class SFOIngredientFactory extends IngredientFactory{

	@Override
	Dough createDought() {
		// TODO Auto-generated method stub
		return new SFODough();
	}

	@Override
	Sauce createSauce() {
		// TODO Auto-generated method stub
		return new SFOSauce();
	}
	
	

}
