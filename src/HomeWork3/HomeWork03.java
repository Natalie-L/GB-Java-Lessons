package HomeWork3;

public class HomeWork03 {
    public static void main(String[] args) {
    /* 1) Задать целочисленный массив, состоящий из элементов 0 и 1.
          Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
          С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
        int[] arr01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        change(arr01);
        printArray(arr01);
    /* 2) Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 … 100;
    */
        int[] arr02 = new int[100];
        fillArray(arr02);
        printArray(arr02);
    /* 3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;
    */
        int[] arr03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multArray(arr03);
        printArray(arr03);
    /* 4) Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
         если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы
         таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    */
        int[][] arr04 = new int[4][4];
        diagonalArray(arr04);
        printBArray(arr04);
    /* 5) Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
         массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
     returnArray(5, 666);
    }


    // Методы для задания 1

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void printArray(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i] + " | ");
        }
        System.out.println(" ");
    }
// Метод для задания 2

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }
// Метод для задания 3

    public static void multArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] + 2;
            }
        }
    }

    // Метод для задания 4
    public static void diagonalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }

    public static void printBArray(int[][] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                System.out.print(someArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    // Метод для задания 5
    public static void returnArray(int len, int initValue) {
        int[] hArray = new int[len];
        for (int i = 0; i < hArray.length; i++) {
            hArray[i] = initValue;
            System.out.print(hArray[i] + " | ");
        }
        System.out.println(" ");

    }

}


  /*

        * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
         если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры:
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

        граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.


        *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
         или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы
          смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
          Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
          (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
*/