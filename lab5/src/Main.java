import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //#1
//        int arr[]= {5, 100, 193, -100, 0, 123, 954, 542, 654, 912, 769, 858, 454, -985, -341,
//        -123, 93, 12, 54, 38};
//        int size = arr.length;
//
//        bubbleSort(arr, size);
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static void bubbleSort(int arr[], int size) {
//        for (int i = size - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
        //#2
        String names[] = new String[] {"Roman", "Anna", "Petr", "Maria"};

        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        Arrays.sort(names, Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }

}