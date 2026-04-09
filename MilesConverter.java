import java.util.Scanner;
public class MilesConverter{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");

        double miles = inputCollector.nextInt();

        double kilometer = miles * 1.6;

        System.out.println(miles + "miles is equal to " + kilometer +"kilometer");

    }

}
