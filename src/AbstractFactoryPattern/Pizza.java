package AbstractFactoryPattern;

public abstract class Pizza {
	
	Dough dought;
	Sauce sauce;
	Pizza(IngredientFactory factory)
	{
		dought = factory.createDought();
		sauce = factory.createSauce();
	}
	public abstract void create();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();

}
