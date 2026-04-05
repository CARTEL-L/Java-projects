import java.util.Scanner;
public class TaskSeventeen{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = inputCollector.nextInt();

        int sum = number + 10;

        System.out.printf("The sum is %d%n", sum);

    }

}
