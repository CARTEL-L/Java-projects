import java.util.Scanner;
public class TaskNineteen{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = inputCollector.nextInt();

        int remainder = number/2;

        System.out.printf("The is resultremainder is %d%n", remainder);

    }

}
