package observer;

public class EmailSubscriber implements Observer {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    public void update(String news) {
        System.out.println("Email sent to " + email + ": " + news);
    }
}