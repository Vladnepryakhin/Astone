import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        pustoyMassive();
    }

    private static void pustoyMassive() {
        int[] arr = new int[100];
        arr [0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr [i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}