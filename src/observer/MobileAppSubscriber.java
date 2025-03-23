package observer;

public class MobileAppSubscriber {
    private String username;

    public MobileAppSubscriber(String username) {
        this.username = username;
    }

    public void receiveNewsUpdate(String news) {
        System.out.println("Push notification sent to " + username + ": " + news);
    }
}