package AbstractFactoryPattern;

public class ChicagoCheesePizza extends Pizza{

	IngredientFactory factory;
	ChicagoCheesePizza(IngredientFactory factory) {
		
		super(factory);
		this.factory = factory;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("ChicagoCheesePizza prepared");
		 dought = factory.createDought();
		sauce = factory.createSauce();
		dought.doughType();
		sauce.sauceType();
		
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("ChicagoCheesePizza baked");
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("ChicagoCheesePizza cut");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("ChicagoCheesePizza packed in box");
			
	}

}
