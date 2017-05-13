package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * This concrete class implements subject so that this provides the implementation for
 * Register, unregister and updatesubscribers method.
 */

public class NewsLetterImpl implements NewsLetter{
	
	private String news = "This will be changed.";
	
	private List<Subscriber>  subscriber = new ArrayList<Subscriber>();
	NewsLetterImpl(){
		
	}

	@Override
	public void registerSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscriber.add(s);
		
	}

	@Override
	public void unSubscribe(Subscriber s) {
		// TODO Auto-generated method stub
		subscriber.remove(s);
		
	}

	// this is to push the news to subscribers.
	@Override
	public void updateSubscribers() {
		// TODO Auto-generated method stub
		for (Subscriber sub : subscriber)
		{
			sub.updateViaPush(news);
			sub.updateViaPull(this);
		}
		
	}
	
	public void setNews(String updatedNews)
	{
		news = updatedNews;
		updateSubscribers();
	}
	
	// this is to pull from subscribers.
	public String getNews()
	{
		return news;
	}

}
