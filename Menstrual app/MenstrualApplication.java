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

        int lmp = 1; 
        int cycleLength = 28;
        int periodLength = 5;

        System.out.println("your next period is in " + nextPeriod(lmp, cycleLength));
        System.out.println("ovulation day is in " + ovulationDay(lmp, cycleLength));
        System.out.println("period end in " + periodEnd(lmp, periodLength));
    }
}
