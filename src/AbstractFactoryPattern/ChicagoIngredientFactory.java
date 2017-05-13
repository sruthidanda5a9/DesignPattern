package AbstractFactoryPattern;

public class ChicagoIngredientFactory extends IngredientFactory{

	@Override
	Dough createDought() {
		// TODO Auto-generated method stub
		return new ChicagoDough();
	}

	@Override
	Sauce createSauce() {
		// TODO Auto-generated method stub
		return new ChicagoSauce();
	}
	
	

}
