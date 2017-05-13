package CommandPattern;

public class Fan {
	
	private String prevous;
	
	public String getPrevous() {
		return prevous;
	}

	public void setPrevous(String prevous) {
		this.prevous = prevous;
	}

	public void low()
	{
	System.out.println("Write the code to set the fan in low mode");	
	}
	
	public void medium()
	{
		System.out.println("Write the code to set the fan in medium mode");
	}
	
	public void hight()
	{
		System.out.println("Write the code to set the fan in  hign mode.");
	}
	
	

}
