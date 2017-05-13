package CommandPattern;

public class GarageDoor implements Door{

	@Override
	public void open() {
		System.out.println("code need to be implemented to open GarageDoor");
	}

	@Override
	public void close() {
		System.out.println("code need to be implemented to close GarageDoor");		
	}

	@Override
	public void lock() {
		System.out.println("code need to be implemented to lock GarageDoor");		
	}

	@Override
	public void openLock() {
		System.out.println("code need to be implemented to openLock GarageDoor");		
	}
	

}
