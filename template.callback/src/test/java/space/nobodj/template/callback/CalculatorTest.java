package space.nobodj.template.callback;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void calcSumTest() throws NumberFormatException, IOException{
		Calculator cal = new Calculator();
		int sum = cal.calcSum(getClass().getResource("/numbers.txt").getPath());
		assertThat(sum, is(10));
	}
	
}
