import java.util.Scanner;
public class TaskEighteen{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = inputCollector.nextInt();

        int result = number - 5;

        System.out.printf("The result is %d%n", result);

    }

}
