package observer;

public class EmailSubscriber {
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    public void receiveNewsUpdate(String news) {
        System.out.println("Email sent to " + email + ": " + news);
    }
}