import java.util.Scanner;
public class Equilateral{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("length of sides: ");

        float length = inputCollector.nextFloat();

        float area = (length * length)  * 0.8660f ;

        System.out.println("the area is:  " +  area);

    }

}
