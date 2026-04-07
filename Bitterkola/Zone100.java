import java.util.Scanner;
public class Zone100{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("digit: ");

        int digit = inputCollector.nextInt();

    if(digit >= 11 && digit <100) {
System.out.println("it is between 10 and 100");
}
    else{
System.out.println("outside zone");
}
    }

}
