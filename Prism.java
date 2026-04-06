import java.util.Scanner;
public class Prism{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter area: ");

        float area = inputCollector.nextFloat();

        System.out.print("Enter length: ");

        float length = inputCollector.nextFloat();

        float volume = area * length;

        System.out.println("The volume is:" + area);

    }

}
