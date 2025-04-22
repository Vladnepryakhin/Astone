public class Main {
    public static void chekSumSing(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная.");
        }
    }
    public static void main(String[] args) {
        chekSumSing(5, 3);
        chekSumSing(-10, 5);
    }
}