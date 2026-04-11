import java.util.Scanner;
public class RainbowDisplay{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("colours: ");

        int colour = inputCollector.nextInt();

    if(colour == 1) {
System.out.printf("Violet");
}
    else if(colour == 2) {
System.out.printf("indigo");
}
    else if(colour == 3) {
System.out.printf("blue");
}
    else if(colour == 4) {
System.out.printf("green");
}
    else if(colour == 5) {
System.out.printf("yellow");
}
    else if(colour == 6) {
System.out.printf("orange");
}
    else if(colour == 7) {
System.out.printf("red");
}

    }

}
