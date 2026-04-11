import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Grade: ");
        int grade = inputCollector.nextInt();

        if (grade >= 90) {
            System.out.printf("The Grade is %d%nA%n", grade);
        } else if (grade >= 80) {
            System.out.printf("The Grade is %d%nB%n", grade);
        } else if (grade >= 70) {
            System.out.printf("The Grade is %d%nC%n", grade);
        } else if (grade >= 60) {
            System.out.printf("The Grade is %d%nD%n", grade);
        } else {
            System.out.printf("The Grade is %d%nF%n", grade);
        }
    }
}
