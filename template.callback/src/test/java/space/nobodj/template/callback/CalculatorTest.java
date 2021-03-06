package space.nobodj.template.callback;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Test;

public class CalculatorTest {
	Logger logger = Logger.getLogger(getClass());
	
	@Test
	public void calcSumTest() throws IOException{
		Calculator cal = new Calculator();
		int sum = cal.calcSum(getClass().getResource("/numbers.txt").getPath());
		logger.debug("sum="+sum);
		assertThat(sum, is(10));
	}
	
	@Test
	public void calcMultiplyTest() throws IOException{
		Calculator cal = new Calculator();
		int result = cal.calcMultiply(getClass().getResource("/numbers.txt").getPath());
		logger.debug("result="+result);
		assertThat(result, is(24));
	}
	
}
