package FactoryMethod;

public class SFOGreekPizza implements Pizza{

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
