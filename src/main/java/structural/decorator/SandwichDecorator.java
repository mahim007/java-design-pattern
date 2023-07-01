package structural.decorator;

public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();
    }
}
