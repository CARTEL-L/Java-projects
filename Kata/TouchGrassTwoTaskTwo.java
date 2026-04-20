import java.util.Scanner;
public class TouchGrassTwoTaskTwo{
public static void main(String[] args){
 Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number: ");
     int number = inputCollector.nextInt();

   boolean decision = number % 2 == 0 ? true : false;
System.out.println(decision);
}
    }
