package task02;

public class Main {
    static String printBonus;
    private static final String CURRENCY = "EUR";

    public static void main (String[] args) {

        Employees employee01 = new Employees();
        employee01.employeesName = "Tom";
        employee01.employeesWork = "seller";
        employee01.employeesSalary = 1540.35;
        employee01.bonusToggle = true;
        employee01.employeesBonus = 32.97;

        if (employee01.bonusToggle) {
            printBonus = ", bonus " + CURRENCY + " " + employee01.employeesBonus + ".";
        } else {
            printBonus = ".";
        }

        System.out.println(employee01.employeesName + ", " + employee01.employeesWork + ", salary " + CURRENCY + " " + employee01.employeesSalary + printBonus);

        Employees employee02 = new Employees();
        employee02.employeesName = "Bob";
        employee02.employeesWork = "driver";
        employee02.employeesSalary = 1090.29;
        employee02.bonusToggle = false;
        employee02.employeesBonus = 0.00;

        if (employee02.bonusToggle) {
            printBonus = ", bonus " + CURRENCY + " " + employee02.employeesBonus + ".";
        } else {
            printBonus = ".";
        }

        System.out.println(employee02.employeesName + ", " + employee02.employeesWork + ", salary " + CURRENCY + " " + employee02.employeesSalary + printBonus);

    }
}