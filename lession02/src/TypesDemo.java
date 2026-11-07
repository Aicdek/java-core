public class TypesDemo {
    public static void main(String[] args) {
        System.out.println("byte:  от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short:  от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("int:  от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long:  от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float:  от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double:  от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);

        int i = Integer.MAX_VALUE;
        i = i + 1;
        System.out.println();
        System.out.println(i);

        //когда мы прибавляем к максимальному значению типу данных int счётчик сбрасывается и начинается
        //с самого начала, то есть с минимально возможного отрицательного числа




    }
}
