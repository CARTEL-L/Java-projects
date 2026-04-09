import java.util.Scanner;
public class TaskTweentyOne{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter base: ");

        int base = inputCollector.nextInt();

        System.out.print("Enter height: ");

        int height = inputCollector.nextInt();

        int AOT = base * height;

        System.out.printf("The AOT is: %d%n", AOT);

    }

}
