package structural.decorator;

public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return sandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
