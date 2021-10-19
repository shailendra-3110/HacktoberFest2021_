package Java_programs;

/**
 * CoffeeMachine
 */
public class CoffeeMachine {

    private float Water;
    private int CoffeePowder;

    public CoffeeMachine(float water, int coffeepowder) {
        if (water <= 1.5 && coffeepowder <= 500 && water > 0 && coffeepowder > 0) {
            this.Water = water;
            this.CoffeePowder = coffeepowder;
        }

    }

    public CoffeeMachine(CoffeeMachine c) {
        this.Water = c.Water;
        this.CoffeePowder = c.CoffeePowder;
    }

    // seter and getter for water
    public void setWater(float water) {
        if (water <= 1.5 && water > 0) {
            Water = water;
        }
    }

    public float getWater() {
        return Water;
    }

    // seter and getter for Coffee Powder
    public void setCoffeePowder(int coffeePowder) {
        if (coffeePowder <= 500 && coffeePowder > 0) {
            CoffeePowder = coffeePowder;
        }

    }

    public int getCoffeePowder() {
        return CoffeePowder;
    }

    @Override
    public String toString() {
        return "Coffee Machine: Water = " + Water + " L, Coffee Powder= " + CoffeePowder + " G.";
    }

    public boolean makeCoffee(String Serving_size, int cups) {
        int cup_count = 0;
        int i = cups;
        if (Serving_size.toLowerCase() == "small") {
            while (i > 0) {
                if (Water >= 0.15 && CoffeePowder >= 10.5) {
                    cup_count++;
                    this.Water -= 0.15;
                    this.CoffeePowder -= 10.5;
                    System.out.println("Enjoy your coffee ");
                }
                i -= 1;
            }
            if (cups == cup_count) {
                return true;

            }
        }

        if (Serving_size.toLowerCase() == "large") {
            while (i > 0) {
                if (Water >= 0.30 && CoffeePowder >= 21) {
                    cup_count++;
                    this.Water -= 0.30;
                    this.CoffeePowder -= 21;
                    System.out.println("Enjoy your coffee");
                }
                i -= 1;
            }
            if (cups == cup_count) {
                return true;

            }
        }
        System.out.println(cup_count + " cups of coffee made from given ingredient.");
        System.out.println("Cannot make coffee");
        return false;
    }

}

class Test {
    public static void main(String[] args) {

        CoffeeMachine c1 = new CoffeeMachine(1, 420);
        CoffeeMachine c2 = new CoffeeMachine(c1);
        c1.setWater((float) (c1.getWater() + 0.8));
        System.out.println(c1 + "\n");
        c1.makeCoffee("small", 150);

    }

}
