import java.util.Scanner;
public class Feets{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter meters: ");

        float meters = inputCollector.nextFloat();

        double feets = meters * 3.2786;

        System.out.println(meters + "meters is equal to " + feets +"feets ");

    }

}
