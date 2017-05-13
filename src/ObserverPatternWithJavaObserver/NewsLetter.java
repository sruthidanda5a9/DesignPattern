package ObserverPatternWithJavaObserver;


import java.util.Observable;

/*
 * This is using the java provided subject class and the news letter concert class is extending.
 * the observable interface.
 * here java class observable is responsible for registering and unregistering and updating the observers.
 */
public class NewsLetter extends Observable{
	
	private String news = "This will be changed.";
	
	public void setNews(String updatedNews)
	{
		news = updatedNews;
		setChanged();
		notifyObservers();
	}
	
	// this is to pull from subscribers.
	public String getNews()
	{
		return news;
	}
}
