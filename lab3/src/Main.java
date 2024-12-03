import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //#1
//        for (int i = 1; i < 100; i++) {
//            int a = i % 2;
//            if (a != 0) {
//                System.out.print(i + " ");
//                i++;
//            }
//        }
        //#2
//        System.out.println("-------------------------------------");
//        System.out.println("Введите число");
//        System.out.println("-------------------------------------");
//        Scanner inputn = new Scanner(System.in);
//        int n = inputn.nextInt();
//        long result = 1;
//
//        for (int i = 1; i < n+1; i++) {
//            result *= i;
//        }
//        System.out.println("-------------------------------------");
//        System.out.println("Факториал = " + result);
//        System.out.println("-------------------------------------");
        //#3
//        int i = 0;
//        while (i < 99) {
//            i++;
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();

//        System.out.println("-------------------------------------");
//        System.out.println("Введите число");
//        System.out.println("-------------------------------------");
//        Scanner inputn = new Scanner(System.in);
//        int n = inputn.nextInt();
//        long result = 1;
//
//        int b = 1;
//        while (b < n) {
//            b++;
//            result *= b;
//        }
//
//        System.out.println("-------------------------------------");
//        System.out.println("Факториал = " + result);
//        System.out.println("-------------------------------------");
        //#4
//        System.out.println("-------------------------------------");
//        System.out.println("Введите число");
//        System.out.println("-------------------------------------");
//        Scanner inputx = new Scanner(System.in);
//        int x = inputx.nextInt();
//        System.out.println("-------------------------------------");
//        System.out.println("Введите степень");
//        System.out.println("-------------------------------------");
//        Scanner inputn = new Scanner(System.in);
//        int n = inputn.nextInt();
//        int result = 1;
//
//        for (int i = 1; i < n+1; i++) {
//            result *= x;
//        }
//
//        System.out.println("-------------------------------------");
//        System.out.println("Число в степени = " + result);
//        System.out.println("-------------------------------------");
        //#5
//        int a = 0;
//        int b = -5;
//        for (int i = 0; i < 10; i++) {
//            int result = a + i * b;
//            System.out.print(result + " ");
//        }
        //#6
        String searchMe = "Мама мыла раму";
        int max = searchMe.length();
        char symb = 'ы';
        int find = 0;

        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) == symb) {
                find++;
                if (find >= 2) {
                    System.out.println("Символ " + symb + " встречается 2 и более раза");
                    break;
                }

            }
        }
        if (find < 2) {
            System.out.println("Символ " + symb + " не встречается 2 и более раза");
        }
    }
}