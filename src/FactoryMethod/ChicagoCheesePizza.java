package FactoryMethod;

public class ChicagoCheesePizza implements Pizza{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("ChicagoCheesePizza prepared");
		
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
