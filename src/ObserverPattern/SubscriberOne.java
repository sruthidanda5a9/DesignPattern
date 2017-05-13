package ObserverPattern;

/*
 * This is implements Subscriber and register to news letter in main method.
 * so this class will be notified whenever something changes in newsletter.
 */
public class SubscriberOne implements Subscriber{
	NewsLetterImpl news;
	SubscriberOne()
	{
		 
	}

	@Override
	public void updateViaPush(String news) {
		String updatedNews = news + "This is updated";
		System.out.println(updatedNews);
		
	}

	@Override
	public void updateViaPull(Object Obj) {
		// TODO Auto-generated method stub
		NewsLetterImpl news  = (NewsLetterImpl)Obj;
		news.getNews();
		System.out.println(news.getNews() + "This news is via pull method");
		
	}
}
