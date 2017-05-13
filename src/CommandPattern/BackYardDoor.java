package CommandPattern;

public class BackYardDoor implements Door{

	@Override
	public void open() {
		System.out.println("Code need to be implemented to open BackYardDoor.");
	}

	@Override
	public void close() {
		System.out.println("Code need to be implemented to Close BackYardDoor.");		
	}

	@Override
	public void lock() {
		System.out.println("Code need to be implemented to Lock BackYardDoor.");		
	}

	@Override
	public void openLock() {
		System.out.println("Code need to be implemented to openLock BackYardDoor.");		
	}
	

}
