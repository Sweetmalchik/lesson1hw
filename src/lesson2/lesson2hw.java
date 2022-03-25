package lesson2;

import java.util.Arrays;

public class lesson2hw {
    public static void main(String[] args) {
        task1();
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        task2();
        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        task3();
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        task4();
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        task5();
//        task6();
//        task7();
    }

    private static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.print("set array: \n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("\nfix array: \n" + Arrays.toString(arr) + "\n");
    }

    private static void task2() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        System.out.println("array task 2: \n" + Arrays.toString(array) + "\n");
    }

    private static void task3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array task 3:\n" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("fix array task 3:\n" + Arrays.toString(array) + "\n");
    }

        private static void task4() {
            int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
}
