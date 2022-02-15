
import org.junit.Test;

import org.junit.Assert;

public class InvoiceServiceTest {
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
		double distance = 2.0;
		 int time = 5;
		double fare = invoiceGenerator.calculateFare(distance,time);
		Assert.assertEquals(expected:25, fare,   delta:0.0);
		 
	}
	

}
