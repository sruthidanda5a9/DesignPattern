package CommandPattern;

public class MainDoor implements Door{

	@Override
	public void open() {
		System.out.println("Code need to be implemented to open MainDoor.");
	}

	@Override
	public void close() {
		System.out.println("Code need to be implemented to Close MainDoor.");		
	}

	@Override
	public void lock() {
		System.out.println("Code need to be implemented to Lock MainDoor.");		
	}

	@Override
	public void openLock() {
		System.out.println("Code need to be implemented to openLock MainDoor.");		
	}
	

}
