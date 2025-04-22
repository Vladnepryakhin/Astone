public class Main9 {
    public static boolean visokosYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        System.out.println(visokosYear(4));
        System.out.println(visokosYear(100));
        System.out.println(visokosYear(400));
    }
}