package creational.factory;

public class BlogSite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new PostPage());
    }
}
