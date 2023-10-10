public class Lettuce extends ToppingDecorator {
    public Lettuce(Item burger) {
        super(burger);
    }

    @Override
    protected String getToppingName() {
        return "Lettuce";
    }

    @Override
    protected double getToppingPrice() {
        return 0.5;
    }
}