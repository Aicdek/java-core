public class Time {
    public static void main(String[] args){
        int totalSecond = 3725;
        int hours = totalSecond / 3600;
        int minutes = (totalSecond % 3600) / 60;
        int seconds = totalSecond % 60;

        System.out.printf("%02d:%02d:%02d%n", hours , minutes , seconds);
    }
}
