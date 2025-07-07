class Wine extends Beverage {
    public Wine() {
        super("Wine", 269);
    }

    // Overriding drink method
    @Override
    public void drink(int numCups, int moneyInserted) {
        System.out.println("Enjoy your luxurious Wine!");
        super.drink(numCups, moneyInserted);
    }
}