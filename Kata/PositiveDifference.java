import java.util.Scanner;
public class PositiveDifference{
public static void main(String[] args){
 Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter first number: ");
     int firstnumber = inputCollector.nextInt();
    System.out.print("Enter second number: ");
     int secondnumber = inputCollector.nextInt();
int product = firstnumber - secondnumber;
if(product >= 1){
    System.out.println(product);
    }
}
    }
