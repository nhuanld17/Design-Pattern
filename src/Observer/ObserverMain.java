package Observer;

public class ObserverMain {
    public static void main(String[] args) {
        YoutubeChannel myChannel = new YoutubeChannel("MyChannel");

        Observer nhuan = new YoutubeSubscriber("Nhuan");
        Observer hoang = new YoutubeSubscriber("Hoang");
        Observer quang = new YoutubeSubscriber("Quang");

        myChannel.addSubscriber(nhuan);
        myChannel.addSubscriber(hoang);
        myChannel.addSubscriber(quang);

        myChannel.notifyAllObservers(new YoutubeEvent(EventType.NEW_VIDEO, "Despacito"));
        myChannel.removeSubscriber(hoang);
        System.out.println();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myChannel.notifyAllObservers(new YoutubeEvent(EventType.LIVE_STREAM, "Hitler"));
    }
}
