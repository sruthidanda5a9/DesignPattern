package SingletonPattern;

public class ThreadSafeSingletonPattern {
	
	private static ThreadSafeSingletonPattern uniqueInstance;
	private ThreadSafeSingletonPattern()
	{
		
	}
	
	/*
	 * Keeping the object creation  in synchronized block 
	 * to make it used by single thread at a time.
	 */
	
	public static synchronized ThreadSafeSingletonPattern getInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new ThreadSafeSingletonPattern();
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
