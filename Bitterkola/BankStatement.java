import java.util.Scanner;
public class BankStatement{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Account balance: ");

        int Account = inputCollector.nextInt();

        System.out.print("Annual interest rate: ");

        double Annual = inputCollector.nextDouble();

        System.out.print("year: ");

        int year = inputCollector.nextInt();

        double interest = Account * Annual * year;

        double TOTAL = Account + interest;

    System.out.println("The Total balance is: " + TOTAL);

    }

}
