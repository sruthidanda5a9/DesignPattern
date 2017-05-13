package ObserverPattern;

/*
 * This is the observer interface. In one to many relationship this is many. 
 * Subject updates the class who implements subscriber class and registered to subject.
 * 
 */
public interface Subscriber {
	
	public void updateViaPush(String news);
	public void updateViaPull(Object Obj);

}
