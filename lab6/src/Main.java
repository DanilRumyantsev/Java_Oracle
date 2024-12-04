import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //#1
//        int[][] matrix = {
//                {-1, 2, -3, 4, -5, 8},
//                {-6, 7, -8, 9, -10, 12},
//                {11, -12, 13, -14, 15, 16},
//                {-16, 17, -18, 19, -20, 22},
//                {21, -22, 23, -24, 25, -26}
//        };
//
//
//        for (int i = 2; i <= 2; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
        //#2
//        int[][] matrixa = {
//                {-1, 2, -3},
//                {-6, 7, -8},
//                {11, -12, 13},
//        };
//
//        int[][] matrixb = {
//                {-5, 1, 4},
//                {-2, 14, -10},
//                {20, -31, 45},
//        };
//
//        int[][] matrixsum = new int[matrixa.length][matrixa[0].length];
//        int[][] matrixmul = new int[matrixa.length][matrixa[0].length];
//
//        for (int i = 0; i < matrixa.length; i++) {
//            for (int j = 0; j < matrixa[i].length; j++) {
//                matrixsum[i][j] = matrixa[i][j] + matrixb[i][j];
//            }
//        }
//
//        for (int i = 0; i < matrixa.length; i++) {
//            for (int j = 0; j < matrixa[i].length; j++) {
//                matrixmul[i][j] = matrixa[i][j] * matrixb[i][j];
//            }
//        }
//
//        System.out.println("-------------------------------");
//        System.out.println("Сумма:");
//        System.out.println("-------------------------------");
//        for (int i = 0; i < matrixsum.length; i++) {
//            for (int j = 0; j < matrixsum[i].length; j++) {
//                System.out.print(matrixsum[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println("-------------------------------");
//        System.out.println("Умножение:");
//        System.out.println("-------------------------------");
//        for (int i = 0; i < matrixmul.length; i++) {
//            for (int j = 0; j < matrixmul[i].length; j++) {
//                System.out.print(matrixmul[i][j] + "\t");
//            }
//            System.out.println();
//        }
        //#3
//        int arr[][] = {
//                {1, 2, 3},
//                {3, 2, 1},
//                {4, 5, 6}
//        };
//
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//        }
//
//        System.out.println("Сумма всех элементов = " + sum);
        //#4
//        int arr[][] = {
//                {1, 2, 3},
//                {-3, -2, 1},
//                {1, -5, 15}
//        };
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i][j] < 0) {
//                    System.out.println("Отрицательный элемент на позиции: [" + i + "][" + j + "]");
//                }
//            }
//        }
        //#5
        int[][] arr = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[] flatArray = new int[arr.length * arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                flatArray[index++] = arr[i][j];
            }
        }

        Arrays.sort(flatArray);

        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = flatArray[index++];
            }
        }

        System.out.println("Отсортированный: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}