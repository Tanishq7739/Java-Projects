class Coffee extends Beverage {
    public Coffee() {
        super("Coffee", 125);
    }

    // Overriding drink method
    @Override
    public void drink(int numCups, int moneyInserted) {
        System.out.println("Enjoy your soothing and relaxing Coffee!");
        super.drink(numCups, moneyInserted);
    }
}