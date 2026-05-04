import java.util.Scanner;

public class MenstrualApplication {

    public static int nextPeriod(int lmp, int cycleLength) {
        return lmp + cycleLength;
    }

    public static int ovulationDay(int lmp, int cycleLength) {
        int nextPeriod = lmp + cycleLength;
        return nextPeriod - 14;
    }

    public static int periodEnd(int lmp, int periodLength) {
        return lmp + periodLength;
    }

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("====== Cartel Menstrual Application for women ======");
        
        System.out.print("\nEnter first day of your last menstrual period (LMP): ");
        int lmp = inputCollector.nextInt();
        System.out.print("Enter your cycle length (e.g. 28): ");
        int cycleLength = inputCollector.nextInt();
        System.out.print("Enter your period length (e.g. 5): ");
        int periodLength = inputCollector.nextInt();

        
        System.out.println("Your next period is in: " + nextPeriod(lmp, cycleLength));
        System.out.println("Your ovulation day is: " + ovulationDay(lmp, cycleLength));
        System.out.println("Your period will end in: " + periodEnd(lmp, periodLength));

        inputCollector.close();
    }
}
