import java.util.Scanner;
public class TaskTweenty{
    public void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter length: ");

        int length = inputCollector.nextInt();

        System.out.print("Enter width");

        int width = inputCollector.nextInt();

        int area = length * width;

        System.out.printf("The area is %d%n", area);

    }

}
