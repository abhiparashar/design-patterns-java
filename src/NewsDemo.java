import observer.EmailSubscriber;
import observer.MobileAppSubscriber;
import observer.NewsPublisher;

// NewsDemo.java
public class NewsDemo {
    public static void main(String[] args) {
        // Create our news publisher
        NewsPublisher publisher = new NewsPublisher();

        // Create some subscribers
        EmailSubscriber john = new EmailSubscriber("john@example.com");
        EmailSubscriber mary = new EmailSubscriber("mary@example.com");
        MobileAppSubscriber alex = new MobileAppSubscriber("alex_mobile");

        // Add them to the publisher
        publisher.addEmailSubscriber(john);
        publisher.addEmailSubscriber(mary);
        publisher.addMobileSubscriber(alex);

        // Publish some news
        publisher.publishNews("Breaking: Java Is Awesome!");

        // Remove one subscriber
        publisher.removeEmailSubscriber(john);

        // Publish more news
        publisher.publishNews("Update: John Unsubscribed!");
    }
}