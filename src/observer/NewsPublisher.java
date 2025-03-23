package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    // The current headline
    private String latestNews;

    // A list to keep track of who wants our news
    private List<EmailSubscriber> emailSubscribers = new ArrayList<>();
    private List<MobileAppSubscriber> mobileSubscribers = new ArrayList<>();

    // Method to publish a news headline
    public void publishNews(String news) {
        this.latestNews = news;

        // Tell all email subscribers
        for (EmailSubscriber subscriber : emailSubscribers) {
            subscriber.receiveNewsUpdate(latestNews);
        }

        // Tell all mobile subscribers
        for (MobileAppSubscriber subscriber : mobileSubscribers) {
            subscriber.receiveNewsUpdate(latestNews);
        }
    }

    // Methods to add/remove email subscribers
    public void addEmailSubscriber(EmailSubscriber subscriber) {
        emailSubscribers.add(subscriber);
    }

    public void removeEmailSubscriber(EmailSubscriber subscriber) {
        emailSubscribers.remove(subscriber);
    }

    // Methods to add/remove mobile subscribers
    public void addMobileSubscriber(MobileAppSubscriber subscriber) {
        mobileSubscribers.add(subscriber);
    }

    public void removeMobileSubscriber(MobileAppSubscriber subscriber) {
        mobileSubscribers.remove(subscriber);
    }
}