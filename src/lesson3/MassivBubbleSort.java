package lesson3;

import java.util.Scanner;

public class MassivBubbleSort {

    public static void main(String[] args) {
        MassivBubbleSort ms = new MassivBubbleSort();
        InputData inputData = new InputData();
        Scanner scanner = new Scanner(System.in);

        //ввод длинны массива
        int length = inputData.intInputMethod("\nВведите длину массива : \n");


       //  Делаем проверки введенного значения :

        if (length < 0) {
            length = -(length);
        }

        if (length == 0) {
            System.out.println("\nМассив нулевой длины не может быть создан! ");
            System.out.println("\nМы создали массив из одного элемента.");
            length = 1;
        }

        if (length  > 10 ) {
            System.out.println("\nМассив такой длины будет обрабатываться слишком долго! ");
            System.out.println("Мы обрезали массив до 10 элементов");
            length  = 10;
        }

        int[] array = new int[length];


        //создание массива введённой длинны.
        System.out.println("\nВведите элементы массива : ");

        //ввод элементов массива.

        String inputString = scanner.nextLine();

        // Разбитие строки по символу " "  // [Space]
        String[] numberStringArray = inputString.split(" ");

        // Проверка на совпадение\не совпадение размеров двух массивов
        // За основу цикла берется массив меньшей длины
        int countOfArray = 0;

        if (numberStringArray.length <= array.length) {
            countOfArray = numberStringArray.length;
        }
        else countOfArray = array.length;


        for (int i = 0; i < countOfArray; i++) {

            try {
                array[i] = Integer.parseInt(numberStringArray[i]);
            }
            catch (Exception e) {
                System.out.println("Произошла ошибка при заполнении массива\n");
            }


        }


        ms.maxVal(array, length);

        ms.minVal(array, length);

        ms.sortBubble(array, length);

        ms.countFive(array, length);


    }



    private void maxVal(int[] array, int length) {
        //нахождение максимального значения в массиве array.
        //переменной max задаём значение нулевого элемента.
        int count = array[0];
        //перебираем все элементы массива.
        for (int i = 1; i < array.length; i++) {
            //сравниваем значение переменной max со значениями элемента массива.
            // если значение элемента массива больше значения переменной max,
            // то, новое значение переменной max будет равно значению этого элемента.
            if (array[i] > count) {
                count = array[i];
            }
        }

        System.out.println("Максимальное значение в массиве array: " + count);

    }


    private void minVal(int[] array, int length) {
        //нахождение минимального значения в массиве array.
        //переменной min задаём значение нулевого элемента.
        int count = array[0];
        //перебираем все элементы массива.
        for (int i = 0; i < array.length; i++) {
            // сравниваем значение переменной min со значениями элемента массива.
            // если значение элемента массива меньше значения переменной min,
            // то, новое значение переменной min будет равно значению этого элемента.
            if (array[i] < count) {
                count = array[i];
            }
        }

        System.out.println("Минимальное значение в массиве array: " + count);

    }


    private void sortBubble(int[] array, int length) {

        //сортировка пузырьком.
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //свайп элементов
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }

        }

        //вывод результатов на экран.
        System.out.println("Вывод отсортированного массива : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private void countFive (int[] array, int length) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("\nЧисло 5 не найдено");
        }
        else {
            System.out.println("\nЧисло 5 повторяется " + count + " раз");
        }

    }


}