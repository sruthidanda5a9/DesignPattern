package SingletonPattern;

public class GetSingletonObject {
	
	// With the following code two instances are created since the code is running in different threads.
	
	public static void main(String args[]) {
/*	{
		Thread t = new Thread();
		t.start();
	}

	public void run(){
	       System.out.println("MyThread running");
	       MySingletonPattern instance = MySingletonPattern.getInstance();
			instance.setSingleValues(10);
			System.out.println("Instance object values" + instance.getSingleValues());
			MySingletonPattern instance2 = MySingletonPattern.getInstance();
			System.out.println("Instance object values" + instance2.getSingleValues());
	    }

}
*/
	
	Runnable r = new Runnable() {
        @Override
        public void run() {
        	System.out.println("MyThread running in Runnable");
        }
    };
    Thread t = new Thread(r) {
        @Override
        public void run() {
        	System.out.println("MyThread running");
 	       MySingletonPattern instance = MySingletonPattern.getInstance();
 			instance.setSingleValues(10);
 			System.out.println("Instance object values" + instance.getSingleValues());
 			MySingletonPattern instance2 = MySingletonPattern.getInstance();
 			System.out.println("Instance object values" + instance2.getSingleValues());
        }
    };
    t.start();

	
	
    Thread t2 = new Thread(r) {
        @Override
        public void run() {
        	System.out.println("MyThread running");
        	//calling getinstance with class name.
 	        MySingletonPattern instance = MySingletonPattern.getInstance();
 			instance.setSingleValues(20);
 			System.out.println("Instance object values" + instance.getSingleValues());
 			MySingletonPattern instance2 = MySingletonPattern.getInstance();
 			System.out.println("Instance object values" + instance2.getSingleValues());
        }
    };
    
    t2.start();
	}
}
