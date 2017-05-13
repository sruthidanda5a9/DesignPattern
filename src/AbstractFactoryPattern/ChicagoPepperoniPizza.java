package AbstractFactoryPattern;

public class ChicagoPepperoniPizza extends Pizza{

	ChicagoPepperoniPizza(IngredientFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza  prepared");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza baked");
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza cut");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("PepperoniPizza packed in box");
		
	}

}
