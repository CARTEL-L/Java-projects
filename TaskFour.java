import java.util.Scanner;
public class TaskFour{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter firstnumber: ");

        int firstnumber = inputCollector.nextInt();

        System.out.print("Enter secondnumber: ");

        int secondnumber = inputCollector.nextInt();

        int difference = firstnumber - secondnumber;

        System.out.printf("The difference is %d%n", difference);

    }

}
