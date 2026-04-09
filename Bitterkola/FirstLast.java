import java.util.Scanner;
public class FirstLast{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("first num: ");

        int first = inputCollector.nextInt();

        System.out.print("Second num: ");

        int Second = inputCollector.nextInt();

        System.out.print("Third num: ");

        int Third = inputCollector.nextInt();

        System.out.print("Fourth num: ");

        int Fourth  = inputCollector.nextInt();

        System.out.print("Last num: ");

        int Last = inputCollector.nextInt();

        int sum = first+Last;

    System.out.println("The sum of the first and last num is: " + sum);

    }

}
