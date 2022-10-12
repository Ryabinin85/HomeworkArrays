import java.util.Arrays;
import java.util.Random;

public class ArraysPt2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        increasedComplexityTask1();
        increasedComplexityTask2();
        increasedComplexityTask3();
    }

    public static void task1() {
        TaskCount.printThisTaskNumber();
            /*Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
            Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
            в формате: «Сумма трат за месяц составила … рублей».
            - Критерии оценки
                – Вычисления выполнены корректно.
                – Результат вычислений выведен в консоль.
                – Код написан без ошибок.
                – Соблюдены все условия задания.*/

        int[] array1 = randomArray();
        int sum = 0;
        for (int i = 0; i< array1.length; i++ )
            sum = sum + array1[i];
        System.out.printf("Сумма трат за месяц составила %d рублей \n", sum);
    }

    public static void task2() {
        TaskCount.printThisTaskNumber();
        /*Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей.
        Максимальная сумма трат за день составила … рублей».
        - Критерии оценки
            – Минимальное значение найдено корректно.
            – Максимально значение найдено корректно.
            – При изменении данных массива код работает корректно и выводит верный результат.
            – Результат программы выведен в консоль согласно условию задания.*/

        int[] array1 = randomArray();
        int maxValue = array1[0];
        int minValue = array1[0];

        System.out.println("Исходный массив: ");
        for (int i = 0; i< array1.length; i++ ) {
            System.out.print(array1[i] + " | ");
        }
        System.out.println();

        for (int i = 0; i< array1.length; i++ ) {
            if (array1[i] > maxValue) maxValue = array1[i];
            if (array1[i] < minValue) minValue = array1[i];
        }
        System.out.printf("Максимальная сумма трат за день составила %d рублей \n", maxValue);
        System.out.printf("Минимальная сумма трат за день составила %d рублей \n", minValue);
    }

    public static void task3 () {
        TaskCount.printThisTaskNumber();
        /*А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        - Критерии оценки
            – Средняя сумма трат найдена корректно.
            – При изменении данных массива программа работает корректно и выдает верный результат.
            – В коде учтено, что средняя сумма трат может быть как целым, так и дробным числом.*/

        int[] array1 = randomArray();
        double avgValue;
        int sum = 0;

        for (int i = 0; i< array1.length; i++ ) {
            sum = (sum + array1[i]);
        }
        avgValue = (double) sum / 30;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", avgValue);
    }

    public static void task4 () {
        TaskCount.printThisTaskNumber();
        /*Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        **Важно**: не используйте дополнительные массивы для решения этой задачи.
        Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
        - Критерии оценки
            – Для решения задачи не использовался дополнительный массив.
            – Для решения задачи использовался цикл.
            – Написанный код выводит в консоль корректные данные.*/
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    /******************************* Задачи повышенной сложности ********************************/
    public static void increasedComplexityTask1() {
        TaskCount.printThisIncreasedComplexityTaskNumber();
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
        TaskCount.printThisIncreasedComplexityTaskNumber();
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
        TaskCount.printThisIncreasedComplexityTaskNumber();
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

    public static int[] randomArray() {
        Random random = new Random();

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

}
