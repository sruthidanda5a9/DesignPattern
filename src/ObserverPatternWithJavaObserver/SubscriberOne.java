package ObserverPatternWithJavaObserver;

import java.util.Observable;
import java.util.Observer;

public class SubscriberOne implements Observer{
	SubscriberOne()
	{
		 
	}

/*	@Override
	public void updateViaPush(String news) {
		String updatedNews = news + "This is updated";
		System.out.println(updatedNews);
		
	}

	@Override
	public void updateViaPull(Object Obj) {
		// TODO Auto-generated method stub
		NewsLetter news  = (NewsLetter)Obj;
		news.getNews();
		System.out.println(news.getNews() + "This news is via pull method");
		
	}
*/
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		NewsLetter news  = (NewsLetter)o;
		news.getNews();
		System.out.println("News updated via PULL" + news.getNews());
	}
}
