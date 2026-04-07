import java.util.Scanner;
public class AgeRecord{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Birth year: ");

        int Birth = inputCollector.nextInt();

        System.out.print("current year: ");

        int current = inputCollector.nextInt();

       int Age = current - Birth;

    System.out.print("you are: " + Age  + "years old. ");

    if(Age >= 65){
System.out.println("you are eligible for the for a senior citizen discount");
}
    else{
System.out.println("you are not eligible");
}

    }

}
