package creational.factory;

public class ShopSite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
