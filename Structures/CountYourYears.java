public class CountYourYears {
    public static int numberOfDaysInAYear(int year){
        if (year % 4 == 0 && year % 100 != 0) {
            if (year % 400 == 0) {
                                
            }
            
            return 366;
        }
        return 365;
    }

            public static void main(String[] args) {
                for (int year = 2014; year <= 2034; year++) {
                    int days = numberOfDaysInAYear(year);
                    System.out.println(year + "has" + days + "days");
                    
                }
            }
}