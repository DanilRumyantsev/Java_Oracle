import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          //#1
//        int a = 5;
//        int b = 10;
//        int c = 3;
//        int d = 9;
//        int minimum = 10;
//
//        if (a < minimum) {
//            minimum = a;
//        }
//        if (b < minimum) {
//            minimum = b;
//        }
//        if (c < minimum) {
//            minimum = c;
//        }
//        if (d < minimum) {
//            minimum = d;
//        }
//
//        System.out.println("Минимальное число " + minimum);
        //#2
//        int a = 5;
//        int b = 10;
//        int c = 3;
//        int d = 10;
//        int maximum = 0;
//        int count = 0;
//
//        if (a > maximum) {
//            maximum = a;
//        }
//        if (b > maximum) {
//            maximum = b;
//        }
//        if (c > maximum) {
//            maximum = c;
//        }
//        if (d > maximum) {
//            maximum = d;
//        }
//
//        if (a == maximum) {
//            count++;
//        }
//        if (b == maximum) {
//            count++;
//        }
//        if (c == maximum) {
//            count++;
//        }
//        if (d == maximum) {
//            count++;
//        }
//
//        System.out.println("Количество максимальных чисел " + count);
        //#3
//        int a = 5;
//        int b = 10;
//        int c = 3;
//        int d = 9;
//        int minimum = 10;
//        int maximum = 0;
//
//        if (a < minimum) {
//            minimum = a;
//        }
//        if (b < minimum) {
//            minimum = b;
//        }
//        if (c < minimum) {
//            minimum = c;
//        }
//        if (d < minimum) {
//            minimum = d;
//        }
//
//        System.out.println("----------------------------------------------");
//        System.out.println("Minimum: " + minimum);
//        System.out.println("----------------------------------------------_");
//
//        if (a > maximum) {
//            maximum = a;
//        }
//        if (b > maximum) {
//            maximum = b;
//        }
//        if (c > maximum) {
//            maximum = c;
//        }
//        if (d > maximum) {
//            maximum = d;
//        }
//
//        System.out.println("Maximum: " + maximum);
//        System.out.println("-----------------------------------------------");
        //#4
//        String name1 = "Danil";
//        String name2 = "Roman";
//
//        if (name1.equals(name2)) {
//            System.out.println("Тезки");
//        }
//        else {
//            System.out.println("Разные имена");
//        }

        //#5
        System.out.println("-------------------------------------------------------------");
        System.out.println("Введите номер месяца от 1 до 12");
        System.out.println("-------------------------------------------------------------");
        Scanner inputmonth = new Scanner(System.in);
        int month = inputmonth.nextInt();

        String monthString;
        switch(month) {
            case 1: monthString = "Январь";
                    break;
            case 2: monthString = "Февраль";
                    break;
            case 3: monthString = "Март";
                    break;
            case 4: monthString = "Апрель";
                    break;
            case 5: monthString = "Май";
                    break;
            case 6: monthString = "Июнь";
                    break;
            case 7: monthString = "Июль";
                    break;
            case 8: monthString = "Август";
                    break;
            case 9: monthString = "Сентябрь";
                    break;
            case 10: monthString = "Октбярь";
                    break;
            case 11: monthString = "Ноябрь";
                    break;
            case 12: monthString = "Декабрь";
                    break;
            default: monthString = "Ошибка";
                    break;
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println(monthString);
        System.out.println("-------------------------------------------------------------");
    }
}