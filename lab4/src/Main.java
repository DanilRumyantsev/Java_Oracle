public class Main {
    public static void main(String[] args) {
        //#1
//        int number[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//        int size = number.length;
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(number[i] + ", ");
//        }
        //#2
//        int number[] = {5, -3, 10, -3};
//        int min = number[0];
//        for (int i = 1; i < number.length; i++) {
//            if (number[i] < min) {
//                min = number[i];
//            }
//        }
//
//        System.out.print("Наименьшие элементы массива = ");
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] == min) {
//                System.out.print(number[i] + " ");
//            }
//        }
        //#3
//        int number[] = {10, -3, 10, -3};
//        int max = number[0];
//        for (int i = 1; i < number.length; i++) {
//            if (number[i] > max) {
//                max = number[i];
//            }
//        }
//
//        System.out.print("Наибольшие элементы массива = ");
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] == max) {
//                System.out.print(number[i] + " ");
//            }
//        }
        //#4
//        int number[] = {4, -5, 0, 6, 8};
//        System.out.println("Изначальный массив");
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + " ");
//        }
//        int max = 0;
//        int min = 0;
//        for (int i = 1; i < number.length; i++) {
//            if (number[i] > number[max]) {
//                max = i;
//            }
//        }
//
//        for (int i = 1; i < number.length; i++) {
//            if (number[i] < number[min]) {
//                min = i;
//            }
//        }
//
//        int temp = number[min];
//        number[min] = number[max];
//        number[max] = temp;
//
//        System.out.println();
//        System.out.println("Измененный массив");
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + " ");
//        }
        //#5
        float array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = array.length;
        float sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        float result = sum / size;

        System.out.println("Среднее арифмитическое массива = " + result);
    }
}