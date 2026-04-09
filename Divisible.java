import java.util.Scanner;
public class Divisible{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter Integer: ");

         int Integer = inputCollector.nextInt();

         int A = Integer/2;

         int B = Integer/3;

         int C = Integer/5;

         int D = Integer/7;

        System.out.println("div is: " +Integer/2);

        System.out.println("div is: " +Integer/3);

        System.out.println("div is: " +Integer/5);

        System.out.println("div is: " +Integer/7);

    }

}
