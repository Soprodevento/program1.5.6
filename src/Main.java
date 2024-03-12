import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7};
        System.out.print(Arrays.toString(inverseArray(numbers)));
    }

    public static int[] inverseArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        return reversedArray;
    }
}
  