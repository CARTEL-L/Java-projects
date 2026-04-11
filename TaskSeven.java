import java.util.Scanner;
public class TaskSeven{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = inputCollector.nextInt();

        int square = number * number;

        System.out.printf("The square is %d%n", square);

    }

}
