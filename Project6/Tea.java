class Tea extends Beverage {
    public Tea() {
        super("Tea", 99);
    }

    // Overriding drink method
    @Override
    public void drink(int numCups, int moneyInserted) {
        System.out.println("Enjoy your soothing and relaxing Tea!");
        super.drink(numCups, moneyInserted);
    }
}