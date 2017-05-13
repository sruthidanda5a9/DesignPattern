package AbstractFactoryPattern;

public class NYGreekPizza extends Pizza{

	NYGreekPizza(IngredientFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("GrrekPizza  prepared");
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("GrrekPizza baked");
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("GrrekPizza cut");
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("GrrekPizza packed in box");
		
	}

}
