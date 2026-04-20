import java.util.Scanner;
public class Quotient{
public static void main(String[] args){
 Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter first number: ");
     int firstnumber = inputCollector.nextInt();
    System.out.print("Enter second number: ");
     int secondnumber = inputCollector.nextInt();
float quotient = firstnumber / secondnumber;
float zero = 0 + 0;
if(secondnumber == 0){
    System.out.println(zero);
}
if(quotient == firstnumber / secondnumber){
    System.out.println(quotient);
}
    }
}
