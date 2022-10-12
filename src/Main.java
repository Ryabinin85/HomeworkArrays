import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        increasedComplexityTask1();
        increasedComplexityTask2();
        increasedComplexityTask3();
    }

    public static void task1 () {
        TaskCounter.printThisTaskNumber();
            /*Объявите три массива:
            1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
            2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
            3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
            массива: с помощью ключевого слова или сразу заполненный элементами.
                - Целочисленный массив создан с помощью ключевого слова new
                - Массив с дробными числами создан и сразу заполнен значениями
                - Создан любой произвольный массив одним из двух способов, рассмотренных в уроке*/
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[2];
        array3[0] = 1;
        array3[1] = 2;
    }

    public static void task2 () {
        TaskCounter.printThisTaskNumber();
            /*Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
            начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и
            первым элементом следующего не нужна.
                - В консоль выведены все элементы первого массива в верном порядке через запятую
                - В консоль выведены все элементы второго массива в верном порядке через запятую
                - В консоль выведены все элементы третьего массива в верном порядке через запятую
                - На одной строчке расположены элементы только одного массива*/
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[2];
        array3[0] = 1;
        array3[1] = 2;

        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
        System.out.println(array3[0] + ", " + array3[1]);
    }

    public static void task3 () {
        TaskCounter.printThisTaskNumber();
            /*Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого
            элемента массива, а с последнего.
            Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
            а элементы другого массива – на другой.
            Запятая между последним элементом одного массива и первым элементом следующего не нужна.
            - Критерии оценки
                - В консоль выведены все элементы первого массива в обратном порядке через запятую
                - В консоль выведены все элементы второго массива в обратном порядке через запятую
                - В консоль выведены все элементы третьего массива в обратном порядке через запятую
                - На одной строчке расположены элементы только одного массива*/
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[2];
        array3[0] = 1;
        array3[1] = 2;

        System.out.println(array1[2] + ", " + array1[1] + ", " + array1[0]);
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
        System.out.println(array3[1] + ", " + array3[0]);
    }

    public static void task4 () {
        TaskCounter.printThisTaskNumber();
            /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
            Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
            Распечатайте результат преобразования в консоль.
            - Критерии оценки
                - Все нечетные числа в целочисленном массиве четные с помоущью прибавления 1
                - В консоли распечатан только целочисленный массив*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину массива!");
        int index = scanner.nextInt();
        if (index <= 0) {
            System.out.printf("Введено некорректное значение: \"%d\", " +
                    "\nДлина массива по умолчанию будет равна 5!\n", index);
            index = 5;
            }
        int[] array = new int[index];

        System.out.println("Исходный массив:");
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Массив с четными значениями:");
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void increasedComplexityTask1() {
        TaskCounter.printThisIncreasedComplexityTaskNumber();
        /*Задача на диагонали массива*/

        int matrixSize = 10;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ( i == j || i + j == matrix.length-1) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void increasedComplexityTask2() {
        TaskCounter.printThisIncreasedComplexityTaskNumber();
            /*  У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
            Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
            Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
            Нам дан массив чисел: {5, 4, 3, 2, 1}
            Необходимо привести его к виду: {1, 2, 3, 4, 5}
            Решите задачу с использованием дополнительного массива.
            Напечатайте массив до преобразования и после с помощью
            System.out.println(Arrays.toString(arr));
            Критерии оценки:
            – В консоль выведен результат программы до преобразований массива.
            – В консоль выведен результат программы после преобразований массива.
            – Программа выводит корректный результат при смене значений внутри массива.*/

        int[] array1 = new int[ ] {8, 4, 3, 12, 1};
        int[] array2 = new int[5];

        System.out.println(Arrays.toString(array1));

        for (int j = 0; j < array2.length; j++) {
            for (int i = array1.length-1; i >= 0; i--) {
                if ( i + j == array1.length-1) {
                    array2[j] = array1[i];
                }
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void increasedComplexityTask3() {
        TaskCounter.printThisIncreasedComplexityTaskNumber();
               /* Решите предыдущее задание, но без использования дополнительного массива.
            Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
            Выведите результат программы в консоль тем же способом.
            Уточнения:
            • Это задание не на сортировку.
            • Не использовать Arrays.sort() и другие способы сортировок.
            • Числа в порядке убывания даны исключительно для указания направления чтения.
            • Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.*/

        int[] array = new int[ ] {8, 5, 3, 2, 0};
        System.out.println(Arrays.toString(array));

        for (int i=0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length-1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}