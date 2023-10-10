public class Cheese extends ToppingDecorator {
    public Cheese(Item burger) {
        super(burger);
    }

    @Override
    protected String getToppingName() {
        return "Cheese";
    }

    @Override
    protected double getToppingPrice() {
        return 1.0;
    }
}