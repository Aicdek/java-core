public class SumNamber {
    public static void main(String[] args) {
        int number = 472;

        int hundred = number / 100;
        int ten  = (number / 10) % 10;
        int end  = number % 10;

        System.out.println(hundred + ten + end);
    }
}
