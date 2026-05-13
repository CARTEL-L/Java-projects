import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoTest{

	@Test
	public void testAppReturns20PercentDiscount(){
		int result = OshoFreePromo.discountEngine("BIGBOY20", 18000);
		assertEquals(14400, result);

	}

	@Test
	public void testAppReturns10PercentDiscount(){
		int result = OshoFreePromo.discountEngine("STARTER10", 5000);
		assertEquals(4500, result);
	}


	@Test
	public void testAppReturns35PercentDiscount(){
		int result = OshoFreePromo.discountEngine("OSHOFREE35", 50000);
		assertEquals(32500, result);
	}

}
	