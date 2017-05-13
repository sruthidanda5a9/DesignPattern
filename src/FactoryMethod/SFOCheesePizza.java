package FactoryMethod;

public class SFOCheesePizza implements Pizza{

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
