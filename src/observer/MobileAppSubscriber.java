package observer;

public class MobileAppSubscriber implements Observer {
    private String username;

    public MobileAppSubscriber(String username) {
        this.username = username;
    }

    public void update(String news) {
        System.out.println("Push notification sent to " + username + ": " + news);
    }
}