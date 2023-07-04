package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class TwitterServiceImpl implements TwitterService {
    private Map<String, Tweet> tweets = new HashMap<>();

    public TwitterServiceImpl() {
        insertFakeData();
    }

    private void insertFakeData() {
        tweets.put("Mahim", new Tweet("Mahim", "Hello, this is mahim"));
        tweets.put("Nitol", new Tweet("Nitol", "Hello, this is nitol"));
        tweets.put("Ashim", new Tweet("Ashim", "Hello, this is ashim"));
    }

    @Override
    public String getTimeLine(String name) {
        return tweets.containsKey(name) ?
                tweets.get(name).getMessage() :
                "No User found!";
    }

    @Override
    public void postToTimeline(String name, String message) {
        System.out.println("Posting tweet: " + message + " for " + name);

    }

    class Tweet {
        private String user;
        private String message;

        public Tweet(String user, String message) {
            this.user = user;
            this.message = message;
        }

        public String getUser() {
            return user;
        }

        public String getMessage() {
            return message;
        }
    }
}
