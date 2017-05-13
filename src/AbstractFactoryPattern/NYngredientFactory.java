package AbstractFactoryPattern;

public class NYngredientFactory extends IngredientFactory{

	@Override
	Dough createDought() {
		// TODO Auto-generated method stub
		return new NYDough();
	}

	@Override
	Sauce createSauce() {
		// TODO Auto-generated method stub
		return new NYSauce();
	}
	
	

}
