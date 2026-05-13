public class OshoFreePromo{
	public static int discountEngine(String sampleInput, int cartTotal){
		int discount = 0;
		int totalDiscount = 0;

	if (sampleInput.equals("STARTER10") && cartTotal >= 5000) {
		discount = cartTotal * 10 / 100;		
	}
	else if (sampleInput.equals("BIGBOY20") && cartTotal >= 15000) {
		discount = cartTotal * 20 / 100;		
	}
	else if (sampleInput.equals("OSHOFREE35") && cartTotal > 30000) {
		 discount = cartTotal * 35 / 100;
}


	totalDiscount = cartTotal - discount;


		return totalDiscount;
	
	}


	public static void main(String[] args) {
		int sample = 5000;
		String token = "STARTER10";
		int input = discountEngine(token, sample);
		System.out.println("your final total is $" + input);

	
	}



}