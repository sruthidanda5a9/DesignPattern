package ObserverPattern;

/*
 * This is the subject interface. In one to many relationship ; newsletter is the subject and is ONE.
 */

public interface NewsLetter {
	
	public void registerSubscriber(Subscriber s);
	public void unSubscribe(Subscriber s);
	public void updateSubscribers();

}
