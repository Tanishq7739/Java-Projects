class Juice extends Beverage {
    public Juice() {
        super("Juice", 199);
    }

    // Overriding drink method
    @Override
    public void drink(int numCups, int moneyInserted) {
        System.out.println("Enjoy your refreshing and healthy Juice!");
        super.drink(numCups, moneyInserted);
    }
}