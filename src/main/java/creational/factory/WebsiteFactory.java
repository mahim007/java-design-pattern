package creational.factory;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG -> {
                return new BlogSite();
            }
            case SHOP -> {
                return new ShopSite();
            }
            default -> {
                return null;
            }
        }
    }
}
