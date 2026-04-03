import java.util.Scanner;
public class TaskThree{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter firstnumber: ");

        int firstnumber = inputCollector.nextInt();

        System.out.print("Enter secondnumber: ");

        int secondnumber = inputCollector.nextInt();

        int product = firstnumber * secondnumber;

        System.out.printf("The product is %d%n", product);

    }

}
