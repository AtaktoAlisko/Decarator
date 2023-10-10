public abstract class ToppingDecorator implements Item {
    private Item burger;
`
    public ToppingDecorator(Item burger) {
        this.burger = burger;
    }

    @Override
    public String getName() {
        return burger.getName() + ", " + getToppingName();
    }

    @Override
    public double getPrice() {
        return burger.getPrice() + getToppingPrice();
    }

    protected abstract String getToppingName();
    protected abstract double getToppingPrice();
}

