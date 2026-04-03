import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("What is your age: ");

        int number1 = inputCollector.nextInt();

        System.out.printf("You are %d", number1);

    }

}
