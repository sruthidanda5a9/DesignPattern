package ObserverPattern;

public class ObeserverPattern {

	public static void main(String[] args) {
		
		NewsLetterImpl news = new NewsLetterImpl();
		SubscriberOne subOne = new SubscriberOne();
		news.registerSubscriber(subOne);
		news.setNews("News from main methid");
		SubscriberOne two = new SubscriberOne();
		news.registerSubscriber(two);
		news.setNews("Two object created and registerd");
		news.unSubscribe(subOne);
		news.setNews("First subscriber unregistered");
	}

}
