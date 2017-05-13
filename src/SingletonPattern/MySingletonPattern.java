package SingletonPattern;

public class MySingletonPattern {
	
	private static MySingletonPattern uniqueInstance;
	
	/*
	 * Making the constructor as private. 
	 * So that no outside world cannot create objects for this class.
	 */
	
	private MySingletonPattern()
	{
		
	}
	
	/*
	 * Static methods can be called with the help of ClassName.
	 */
	public static MySingletonPattern getInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new MySingletonPattern();
		}
		return uniqueInstance;
	}
	
	private int singleValues;

	public int getSingleValues() {
		return singleValues;
	}

	public void setSingleValues(int singleValues) {
		this.singleValues = singleValues;
	}
	

}
