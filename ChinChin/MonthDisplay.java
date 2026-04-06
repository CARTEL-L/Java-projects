import java.util.Scanner;
public class MonthDisplay{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("month: ");

        int month = inputCollector.nextInt();

    if(month == 1) {
System.out.printf("january");
}
    else if(month == 2) {
System.out.printf("february");
}
    else if(month == 3) {
System.out.printf("march");
}
    else if(month == 4) {
System.out.printf("april");
}
    else if(month == 5) {
System.out.printf("may");
}
    else if(month == 6) {
System.out.printf("june");
}
    else if(month == 7) {
System.out.printf("july");
}

  if(month == 8) {
System.out.printf("august");
}
    else if(month == 9) {
System.out.printf("september");
}
    else if(month == 10) {
System.out.printf("october");
}
    else if(month == 11) {
System.out.printf("november");
}
    else if(month == 12) {
System.out.printf("december");
}
    else if(month >= 13) {
System.out.printf("Really nigga😒️,wrong parameters🛑️");
}

    }

}
