// TODO: 1 ЛАБОРАТОРНАЯ РАБОТА
// TODO: ЗАДАНИЕ 3

import java.util.Random;

class zadanie_3 {
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(3, 4, -1000, 1000);

        System.out.println("Матрица со случайными числами:");
        printMatrix(matrix);

        int colsWithZeros = countColsWithZeros(matrix);
        System.out.println("Кол-во столбцов с нулями: " + colsWithZeros);

        int[] rowsWithMax = findRowsWithMax(matrix);
        System.out.print("Строки с макс. элементами: ");
        for (int row : rowsWithMax) {
            System.out.print(row + " ");
        }
    }

    public static int[][] generateRandomMatrix(int rows, int cols, int min, int max) { // создание
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countColsWithZeros(int[][] matrix) { // метод для поиска стобцов с нулями и вывода их количества
        // инициализация переменных
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0; // количество столбцов в которых есть нули

        for (int j = 0; j < cols; j++) { // перебор столбцов пока не закончатся строки
            boolean hasZero = false;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] == 0) { // проверка каждого значения на 0
                    hasZero = true;
                    break;
                }
            }
            if (hasZero) { // прибавление 1, если найден 0
                count++;
            }
        }
        return count; // возвращаем количество строк с нулями
    }

    public static int[] findRowsWithMax(int[][] matrix) { // метод поиска строк с максимальными элементами
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] maxVals = new int[rows]; // массив для хранения максимальных элементов каждой строки

        for (int i = 0; i < rows; i++) { // перебор строк
            int max = matrix[i][0];
            for (int j = 1; j < cols; j++) { // перебор каждого элемента в перебираемой строке
                if (matrix[i][j] > max) { // проверка больше ли это значение, чем текущий максимум для строки
                    max = matrix[i][j];
                }
            }
            maxVals[i] = max;
        }

        int maxVal = maxVals[0];
        int count = 1;

        for (int i = 1; i < rows; i++) {
            if (maxVals[i] > maxVal) {
                maxVal = maxVals[i];
                count = 1;
            } else if (maxVals[i] == maxVal) {
                count++;
            }
        }

        int[] rowsWithMax = new int[count];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            if (maxVals[i] == maxVal) {
                rowsWithMax[index] = i;
                index++;
            }
        }
        return rowsWithMax;
    }
}

// все задания должны быть в отчете, смотрит правильно ли выполнен ряд, массиввы и тд, вопросы:
// свойства матриц, одномерные двумерные массивы, как сдвинуть одномерный массив на один элемент влево ил вправ,
// как сдвинуть элемент под диагонали
//
// по второй работе, 1 часть - граф интерфейс для первой лабы, 2 часть - работа со строками в яве два класса для работы со строками
// знать чем отличаются почему класс стринг не рекомендуется использовать если строка меняется часто, знать
// основные методы работы со стринг: преобразование получение из числового символьного массива в строку
// копирование из массива в строку, поиск нужного элемента в строке, копирование части строки
//
// преобразование строки в символьный массив, сивольного массива в строку
// для работы с предложениями есть метод котрый преобразует строку в массив строк
//