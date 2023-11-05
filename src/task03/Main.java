package task03;

public class Main {
    private static final String CURRENCY = "USD";

    public static void main (String[] arg){

        String fruitsName;
        String fruitsType;
        String fruitsPrice;
        String dimension;

        fruitsName = "Orange";
        fruitsType = "citrus";
        fruitsPrice = "2.95";
        dimension = "kg";

        double fruitsPriceDouble = Double.parseDouble(fruitsPrice);

            System.out.println(fruitsName +
                    " is a " +
                    fruitsType +
                    " fruit, price " +
                    CURRENCY + " " +
                    fruitsPriceDouble +
                    " per " + dimension + ".");

    }
}
