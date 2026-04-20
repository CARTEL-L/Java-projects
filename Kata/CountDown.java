import java.util.Scanner;
public class CountDown{
public static void main(String[] args) {
 Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter number: ");
     int number = inputCollector.nextInt();
    int count = number;
while(count >= 1){
    System.out.println(count);
count--;
}
    System.out.println("Blast off!");

    }
}
