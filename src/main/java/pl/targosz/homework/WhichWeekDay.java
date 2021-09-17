package pl.targosz.homework;

public class WhichWeekDay {
    static String WeekDay(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6: case 7:
                return "Weekend!";
            default:
                return "THERE IS NO SUCH A DAY";
        }
    }

    public static void main(String[] args) {
        System.out.println(WeekDay(5));
        System.out.println(WeekDay(6));
        System.out.println(WeekDay(7));
        System.out.println(WeekDay(8));
        System.out.println(WeekDay(10));

    }
}
