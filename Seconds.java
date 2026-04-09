import java.util.Scanner;
public class Seconds{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("sec: ");

        int sec = inputCollector.nextInt();

        System.out.print("mins: ");

        int mins = inputCollector.nextInt();

        System.out.print("hours: ");

        int hours = inputCollector.nextInt();

        int seconds = mins * 60 + hours * 3600;

        System.out.println("In seconds is: " + mins + hours * 60);

    }

}
