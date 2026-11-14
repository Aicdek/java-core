public class TymeCasting {
    public static void main(String[] args){
        double a = 9; //int автоматически преобразуется в double, добавляя дробную часть
        int b = (int) 9.99; // обратная ситуация, из double в int, дробная часть отбрасывается
        long c = Math.round(9.99); // Math.round округляет чисто к ближайшему значению, при этом возвращает в long
        int d = 5 / 2; // если написать цифцы без дроби, то конечный итог также будет без дроби
        double e = 5 / 2; // но если написать в double, он выполнит математическую задачу, а уже потом преобразует int в double, от чего мы полчим 2.0
        double f = 5 / 2.0; // деление с дробнью позволит джаве оставить дробь

        System.out.println("неявное приведение: " + a);
        System.out.println("явное приведение: " + b);
        System.out.println("math round: " + c);
        System.out.println("5 / 2 = " + d);
        System.out.println("5 / 2 = " + e);
        System.out.println("5 / 2.0 = " + f);
    }
}
