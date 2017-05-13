package TemplatePattern;

public class Coffee extends BreveragePreparation{

	@Override
	public void addCondiments() {
		System.out.println("condiments added");
	}

	@Override
	public void brew() {
		System.out.println("Brewed");
	}
	
	public boolean needCondiments()
	{
		return true;
	}

}
