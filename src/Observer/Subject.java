package Observer;

public interface Subject {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifyAllObservers(YoutubeEvent event);
}
