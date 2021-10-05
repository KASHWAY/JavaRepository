package pl.targosz.homework.NamesOfWeekDays;

public class Main {
    private static NamesOfWeekDays DayNumberConvertingToDayName(int number) {
        switch (number) {
            case 1:
                return NamesOfWeekDays.PONIEDZIALEK;

            case 2:
                return NamesOfWeekDays.WTOREK;

            case 3:
                return NamesOfWeekDays.SRODA;

            case 4:
                return NamesOfWeekDays.CZWARTEK;

            case 5:
                return NamesOfWeekDays.PIATEK;

            case 6:
                return NamesOfWeekDays.SOBOTA;

            case 7:
                return NamesOfWeekDays.NIEDZIELA;


            default :
                return NamesOfWeekDays.WRONGNUMBER;

        }

    }
    public static void main(String[] args) {
        System.out.println(DayNumberConvertingToDayName(1));
        System.out.println(DayNumberConvertingToDayName(2));
        System.out.println(DayNumberConvertingToDayName(3));
        System.out.println(DayNumberConvertingToDayName(4));
        System.out.println(DayNumberConvertingToDayName(5));
        System.out.println(DayNumberConvertingToDayName(6));
        System.out.println(DayNumberConvertingToDayName(7));
        System.out.println(DayNumberConvertingToDayName(10));
        System.out.println(DayNumberConvertingToDayName(150));
    }
}
