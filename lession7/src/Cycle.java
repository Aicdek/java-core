public class Cycle {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2;
        k = k % numbers.length;

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[(i + k) % numbers.length] = numbers[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
