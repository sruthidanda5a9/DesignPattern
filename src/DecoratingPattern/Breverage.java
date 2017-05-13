package DecoratingPattern;
/*
 * Adding responsibilies to object at runtime. is decorating pattern.
 */
public abstract class Breverage {
	
	public String description;
	public int cost;
	public abstract int cost();
	
	public void setDescription(String des)
	{
		description = des;
	}
	
	public String getDescription()
	{
		return description;
	}
	
}
