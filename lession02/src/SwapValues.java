public class SwapValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("через способ с 3 переменной: а = " + a + ", b = " + b );

        int c = 5;
        int d = 8;

        System.out.println("Исходные значения: c = " + c + ", d = " + d);

        c = c * d;
        d = c / d;
        c = c / d;

        System.out.println("Способ без 3 переменной c = " + c + ", d = " + d);

    }
}
