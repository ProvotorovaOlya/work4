import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Time time1 = new Time(2, 34, 45);
            System.out.println(time1.toString());
            time1.setHour(11);
            time1.setMinute(34);
            time1.setSecond(56);
            System.out.println(time1.toString());
            time1.changeHour(23);
            System.out.println(time1.toString());
            time1.changeMinute(45);
            System.out.println(time1.toString());
            time1.changeSecond(46);
            System.out.println(time1.toString());
        }
        catch (RuntimeException e){
            System.out.println("неверное время");
        }
    }
}
