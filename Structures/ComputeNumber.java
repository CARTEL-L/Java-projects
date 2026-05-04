import java.util.Scanner;
public class ComputeNumber{
	public static int sumDigits(long n){

		// Scanner inputCollector = new Scanner(System.in);
		// System.out.println("Enter number: ");
	//n = inputCollector.nextLong();

		 int sum = 0;
		while (n != 0) {
			long digit = n % 10;
			sum += digit;
		  n = n / 10;
		 	
		}
			
			return sum;
		}
		

		public static void main(String[] args) {
			Scanner inputCollector = new Scanner(System.in);
			System.out.print("Enter numbers: ");
		long number = inputCollector.nextLong();
		int total = sumDigits(number);
		System.out.println(total);
		}
	}	

