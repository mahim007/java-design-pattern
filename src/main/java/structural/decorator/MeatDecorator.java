package structural.decorator;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return sandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}
