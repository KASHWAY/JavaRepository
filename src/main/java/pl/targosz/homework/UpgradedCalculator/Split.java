package pl.targosz.homework.UpgradedCalculator;

public class Split implements CalculatorInterface {
    public double count(double number1, double number2) {
        if (number1==0||number2==0)
            System.out.println("You can`t split through 0!!!");
            else
        return number1 / number2;
        return 0;
    }
}
