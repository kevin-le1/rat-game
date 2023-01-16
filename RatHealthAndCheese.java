import edu.princeton.cs.algs4.StdOut;

public class RatHealthAndCheese {

    // public allows for these two variables to be mutable throughout different
    // classes
    public int health, cheese;

    // decreases health by 1
    public void decrementHP() {
        health = health - 1;
    }

    // decreases cheese by 1
    public void decrementCheese() {
        cheese = cheese - 1;
    }

    // increases health by 1
    public void incrementHP() {
        health = health + 1;
    }

    // increases cheese by 1
    public void incrementCheese() {
        cheese = cheese + 1;
    
    }

    // gets the current health
    public int getHealth() {
        return health;
    }

    // gets the current cheese
    public int getCheese() {
        return cheese;
    }

    // some test cases to test if the class is currently working
    public static void main(String[] args) {
        RatHealthAndCheese update = new RatHealthAndCheese();
        StdOut.println(update.health);
        update.decrementHP();
        update.incrementHP();
        update.decrementHP();
        StdOut.println(update.health);
        StdOut.println(update.getCheese());
        StdOut.println(update.getHealth());
    }
}
