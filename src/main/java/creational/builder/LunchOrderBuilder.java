package creational.builder;

public class LunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public static class LunchOrder {
        private final String bread;
        private final String condiments;
        private final String dressing;
        private final String meat;

        private LunchOrder(LunchOrderBuilder builder) {
            this.bread = builder.bread;
            this.condiments = builder.condiments;
            this.dressing = builder.dressing;
            this.meat = builder.meat;
        }

        public String getBread() {
            return bread;
        }

        public String getCondiments() {
            return condiments;
        }

        public String getDressing() {
            return dressing;
        }

        public String getMeat() {
            return meat;
        }

        @Override
        public String toString() {
            return "LunchOrder From LunchOrderBuilder: {" +
                    "bread='" + bread + '\'' +
                    ", condiments='" + condiments + '\'' +
                    ", dressing='" + dressing + '\'' +
                    ", meat='" + meat + '\'' +
                    '}';
        }
    }

    public LunchOrderBuilder() {
    }

    public LunchOrder build() {
        return new LunchOrder(this);
    }

    public LunchOrderBuilder bread(String bread) {
        this.bread = bread;
        return this;
    }

    public LunchOrderBuilder condiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public LunchOrderBuilder dressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public LunchOrderBuilder meat(String meat) {
        this.meat = meat;
        return this;
    }
}
