package AbstractFactoryPattern;

public class NYCheesePizza extends Pizza{

	NYCheesePizza(IngredientFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Cheese pizza prepared");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Cheese pizza baked");
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cheese pizza cut");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Cheese pizza packed in box");
		
	}

}
