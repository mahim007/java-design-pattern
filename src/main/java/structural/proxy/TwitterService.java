package structural.proxy;

public interface TwitterService {
    String getTimeLine(String name);
    void postToTimeline(String name, String message);
}
