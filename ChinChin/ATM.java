import java.util.Scanner;
public class ATM{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("PIN: ");

        int PIN = inputCollector.nextInt();

    if(PIN == 1234) {
System.out.printf("$1000");
}
    else if(PIN >= 1235) {
System.out.printf("Incorrect PIN");
}

    }

}
