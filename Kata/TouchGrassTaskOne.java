import java.util.Scanner;
public class TouchGrassTaskOne{
public static void main(String[] args){
 Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter first number: ");
     int firstnumber = inputCollector.nextInt();
    System.out.print("Enter second number: ");
     int secondnumber = inputCollector.nextInt();
if(firstnumber > secondnumber) {
 System.out.println("The maximum is: sss" + firstnumber);
}
  if(firstnumber < secondnumber) {
    System.out.println("The maximum is: " + secondnumber);
}
    }
}
