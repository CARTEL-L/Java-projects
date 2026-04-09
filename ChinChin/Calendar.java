import java.util.Scanner;
public class Calendar{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("year: ");

        int year = inputCollector.nextInt();

        System.out.print("month: ");

        int month = inputCollector.nextInt();

    if(month == 1){
System.out.print("january has 31 days");
}

    else if(month == 2){
System.out.print("february has 29 days");
}

    else if(month == 3){
System.out.print("march has 31 days");
}

    else if(month == 4){
System.out.print("April has 30 days");
}

    else if(month == 5){
System.out.print("May has 31 days");
}

    else if(month == 6){
System.out.print("June has 30 days");
}

    else if(month == 7){
System.out.print("July has 31 days");
}

    else if(month == 8){
System.out.print("August has 31 days");
}

    else if(month == 9){
System.out.print("September has 30 days");
}

    else if(month == 10){
System.out.print("October has 31");
}

    else if(month == 11){
System.out.print("November has 30 days");
}

    else if(month == 12){
System.out.print("December has 31 days");
}

    }

}
