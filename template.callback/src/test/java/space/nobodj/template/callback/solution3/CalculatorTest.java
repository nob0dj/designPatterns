package space.nobodj.template.callback.solution3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Logger logger = Logger.getLogger(getClass());
	//픽스쳐처리
	Calculator cal;
	String filepath;
	
	@Before
	public void init(){
		cal = new Calculator();
		filepath = getClass().getResource("/numbers.txt").getPath();
	}
	
	@Test
	public void calcSumTest() throws IOException{
		int sum = cal.calcSum(filepath);
		logger.debug("sum="+sum);
		assertThat(sum, is(10));
	}
	
	@Test
	public void calcMultiplyTest() throws IOException{
		int result = cal.calcMultiply(filepath);
		logger.debug("result="+result);
		assertThat(result, is(24));
	}
	
	@Test
	public void concatTest() throws IOException{
		String result = cal.concat(filepath);
		logger.debug("result="+result);
		assertThat(result, is("1234"));
	}
	
}
