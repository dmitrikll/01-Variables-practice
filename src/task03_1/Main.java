package task03_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final String CURRENCY = "USD";

    public static void main(String[] args) {

        // Створення об'єкта типу Scanner
        Scanner scanner = new Scanner(System.in);
        // Встановлення локалі для можливості введеня в числі крапки замість коми, тобто, наприклад, 1.25 замість 1,25
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Enter fruit name: ");
        // Отримання String значення через Scanner.nextLine()
        String fruitName = scanner.nextLine();

        System.out.print("Enter fruit type: ");
        // Отримання String значення через Scanner.nextLine()
        String fruitType = scanner.nextLine();

        System.out.print("Enter fruit dimension: ");
        // Отримання String значення через Scanner.nextLine()
        String fruitDimension = scanner.nextLine();

        System.out.print("Enter fruit price: ");
        // Отримання double значення через Scanner.nextDouble()
        double fruitPrice = scanner.nextDouble();

        System.out.print("Enter your age: ");
        // Отримання int значення через Scanner.nextInt()
        int yourAge = scanner.nextInt();

        System.out.println("Your age is " + yourAge + " and you can eat fruit:" + "\n" +
                "\t" + fruitName + " is a " +
                fruitType + " fruit, price " +
                CURRENCY + " " +
                fruitPrice +
                " per " + fruitDimension + ".");

        // Закриваємо Scanner
        scanner.close();
    }

}
