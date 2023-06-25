package creational.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrderBean bean = new LunchOrderBean();
        bean.setBread("bread");
        bean.setCondiments("condiments");
        bean.setDressing("dressing");
        bean.setMeat("meat");
        System.out.println(bean);

        LunchOrderTele tele = new LunchOrderTele("bread1", "condiments1", "dressing1");
        System.out.println(tele);

        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder order = builder
                .meat("builder-meat")
                .dressing("builder-dressing")
                .condiments("builder-condiments")
                .bread("builder-bread")
                .build();
        System.out.println(order);

        LunchOrderBuilder lunchOrderBuilder = new LunchOrderBuilder();
        LunchOrderBuilder.LunchOrder lunchOrder = lunchOrderBuilder
                .meat("new-builder-meat")
                .dressing("new-builder-dressing")
                .condiments("new-builder-condiments")
                .bread("new-builder-bread")
                .build();
        System.out.println(lunchOrder);
        System.out.println(lunchOrder.getBread() + " " + lunchOrder.getCondiments());

        LunchOrderBuilder.LunchOrder lunchOrder2 = lunchOrderBuilder
                .meat("new-builder2-meat")
                .dressing("new-builde2r-dressing")
                .condiments("new-builder2-condiments")
                .bread("new-builder2-bread")
                .build();
        System.out.println(lunchOrder2);
    }
}
