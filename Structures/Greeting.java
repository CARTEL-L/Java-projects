import java.util.Scanner;
public class Greeting{
	public static String greet(String name){

		String greeting = "hello";


		return greeting;
	}

	public static void main(String[] args) {
		Scanner inputCollector = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = inputCollector.next();
		String user = inputCollector.next();
		user = greet(name);
		System.out.println(user + " " + name);
	}

}