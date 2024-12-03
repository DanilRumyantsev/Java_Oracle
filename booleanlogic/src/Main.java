package com.mdk0101.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputFromLine = new Scanner(System.in);
        int firstnumb;
        int secondnumb;
        String inputfirstnumb = "Введите первое число";
        String inputsecondnumb = "Введите второе число";
        String firstbig = "Первое число больше";
        String secondbig = "Второе число больше";
        String numequals = "Числа равны";

        int a = 10;
        byte b;
        b = (byte) a;

        System.out.println(b);

        System.out.println(inputfirstnumb);
        firstnumb = inputFromLine.nextInt();

        System.out.println(inputsecondnumb);
        secondnumb = inputFromLine.nextInt();

        boolean result = firstnumb > secondnumb;

        if (result) {
            System.out.println(firstbig);
        }
        else if (firstnumb < secondnumb) {
            System.out.println(secondbig);
        }
        else if (firstnumb == secondnumb) {
            System.out.println(numequals);
        }
    }
}