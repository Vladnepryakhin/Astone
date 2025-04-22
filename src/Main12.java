public class Main12 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print("Измененный массив: ");
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}