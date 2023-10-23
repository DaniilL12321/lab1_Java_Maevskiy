// TODO: 1 ЛАБОРАТОРНАЯ РАБОТА
// TODO: ЗАДАНИЕ 2

class zadanie_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0, 1, 5, 6, 0, 7, 8};
        //             0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        int product = 1;
        for (int i = 0; i < array.length; i += 2) {
            product *= array[i];
        }
        System.out.println("Произведение элементов с четными номерами: " + product);

        int sum = 0;
        boolean foundFirstZero = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (foundFirstZero) {
                    break;
                } else {
                    foundFirstZero = true;
                }
            } else if (foundFirstZero) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов между первым и последним нулевыми элементами: " + sum);
    }
}