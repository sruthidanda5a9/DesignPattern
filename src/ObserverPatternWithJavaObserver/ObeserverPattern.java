package ObserverPatternWithJavaObserver;

public class ObeserverPattern {

	public static void main(String[] args) {
		
		NewsLetter news = new NewsLetter();
		SubscriberOne subOne = new SubscriberOne();
		news.addObserver(subOne); // this methos is directly from the java implemented class.
		news.setNews("News from main methid");
		
		/*
		 * The main drawback with this observable class is this is class if you extend it you cannot
		 * extend the other classes.
		 */
	}

}
