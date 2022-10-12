public class TaskCount {
    private static int taskCounter = 0;
    private static int increasedComplexityTaskCounter = 0;
    public static void printThisTaskNumber() {
        taskCounter++;
        System.out.printf("\n********* Задание № %d *********\n\n", taskCounter);
    }
    public static void printThisIncreasedComplexityTaskNumber() {
        increasedComplexityTaskCounter++;
        System.out.printf("\n********* Задание повышенной сложности № %d *********\n\n", increasedComplexityTaskCounter);
    }
}