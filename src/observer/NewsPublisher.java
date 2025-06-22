package observer;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class NewsPublisher implements Subject {
    // The current headline
    private volatile String latestNews;

    // A list to keep track of who wants our news
    private List<Observer> observers = new CopyOnWriteArrayList<>();

    // Method to publish a news headline
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    @Override
    public synchronized void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void detach(Observer observer) {
        observers.remove(observer);
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}