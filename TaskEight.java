import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = inputCollector.nextInt();

        int cube = number * number * number;

        System.out.printf("The cube is %d%n", cube);

    }

}
