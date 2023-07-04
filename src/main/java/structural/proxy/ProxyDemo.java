package structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeLine("Mahim"));
        service.postToTimeline("Mahim", "this is a new tweet");
    }
}
