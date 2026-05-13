import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationOfArraysTest{

	@Test
	public void testSumDeviationProduceSum(){
		//Given
		int[] arr = {2,2,2,2,2};
		int result = StandardDeviationOfArrays.sumDeviation(arr);
		assertEquals(10, result);

	}

	@Test
	public void testMeanReturnsSumMean(){
		int[] arr = {2,2,2,2,2};
		//int number = 5;
		double result = StandardDeviationOfArrays.mean(arr);
		assertEquals(2, result);
	}

	@Test
	public void testThatMeanDeviationGivesAccurateResultWhenNunberIsMinusMean(){
		int[] arr = {1,2,3,4,5};
		double result = StandardDeviationOfArrays.meanDeviation(arr);
		assertEquals(2, result);
	}

	 @Test
	 public void testForSquaredDeviationSum(){
	 	int[] arr = {1,2,3,4,5};
	 	double result = StandardDeviationOfArrays.standardDeviation(arr);
	 	assertEquals(4, result);
	 }

	 @Test
	 public void testVariance(){
	 	int[] arr = {1,2,3,4,5};
	 	double result = StandardDeviationOfArrays.variance(arr);
	 	assertEquals(4, result);
	 }

	 @Test
	 public void testStandardDeviationGivesAccurateResult(){
	 	int[] arr = {1,2,3,4,5};
	 	double result = StandardDeviationOfArrays.squareRoot(arr);
	 	assertEquals(1, result);
	 }


}