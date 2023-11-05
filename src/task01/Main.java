package task01;

public class Main {

    private static final String CURRENCY = "USD";

    public static void main(String[] args) {

        Fruits fruit01 = new Fruits();
        fruit01.fruitsName = "Orange";
        fruit01.fruitsType = "citrus";
        fruit01.fruitsPrice = 2.95;
        fruit01.dimension = "kg";

        System.out.println(fruit01.fruitsName +
                " is a " +
                fruit01.fruitsType +
                " fruit, price " +
                CURRENCY + " " +
                fruit01.fruitsPrice +
                " per " + fruit01.dimension + ".");

        Fruits fruit02 = new Fruits();
        fruit02.fruitsName = "Mango";
        fruit02.fruitsType = "tropical";
        fruit02.fruitsPrice = 1.29;
        fruit02.dimension = "item";

        System.out.println(fruit02.fruitsName +
                " is a " +
                fruit02.fruitsType +
                " fruit, price " +
                CURRENCY + " " +
                fruit02.fruitsPrice +
                " per " + fruit02.dimension + ".");

    }
}
