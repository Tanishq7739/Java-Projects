// Parent class Beverage
class Beverage {
    private String name;
    private int cost;

    // Constructor for Beverage
    public Beverage(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // Method to simulate drinking the beverage
    public void drink(int numCups, int moneyInserted) {
        int totalCost = cost * numCups;
        if (moneyInserted < totalCost) {
            System.out.println("Insufficient money! Please insert at least " + (totalCost - moneyInserted) + " more.");
        } else {
            System.out.println("Enjoy your " + numCups + " cups of " + name + "!");
            int change = moneyInserted - totalCost;
            if (change > 0) {
                System.out.println("Please collect your change: " + change + " Rs.");
            }
        }
    }

    // Getter for cost
    public int getCost() {
        return cost;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
