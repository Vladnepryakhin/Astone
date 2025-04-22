public class Main5 {
    public static boolean sumRange(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void main(String[] args) {
        System.out.println(sumRange(10, 20));
    }
}