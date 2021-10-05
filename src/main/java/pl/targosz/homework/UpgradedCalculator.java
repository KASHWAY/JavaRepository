package pl.targosz.homework;

public class UpgradedCalculator {
    private static double add(double number1,double number2){
        return number1+number2;
    }
    private static double minus(double number1,double number2){
        return number1-number2;
    }
    private static double split(double number1,double number2){
        return number1/number2;
    }
    private static double multiplication(double number1,double number2){
        return number1*number2;
    }
    public static void main(String[] args) {
        double number1,number2;
        System.out.println("Upgraded calculator will calculate anything you want!");
        char mark='-';
       switch (mark) {
           case '-' :
               System.out.println(minus(300,150));
                break;
           case '+' :
               System.out.println(add(150,300));
               break;
           case '*' :
               System.out.println(multiplication(5,20));
               break;
           case '/' :
               System.out.println(split(10,0));
               break;
           default:
               System.out.println("Wrong mark!");
       }
    }
}
