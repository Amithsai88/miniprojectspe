package Calc;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateTest {
    private static final double DELTA = 1e-15;
    Calculate calculator = new Calculate();
	@Test
	public void sqaureroot_test() {
		double actual=calculator.root(9.0);
		double exp=3.0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void factorial_test() {
		double actual=calculator.factorial(4);
		double exp=24;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void lne_test() {
		double actual=calculator.log(300);
		double exp=5.703782474656201;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void powerofno_test() {
		double actual=calculator.power(3.0,3.0);
		double exp=27.0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void sqaureroot_test2() {
		double actual=calculator.root(28.0);
		double exp=5.0;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void factorial_test2() {
		double actual=calculator.factorial(7);
		double exp=5041.0;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void lne_test2() {
		double actual=calculator.log(100.799);
		double exp=2.613128435;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void powerofno_test2() {
		double actual=calculator.power(4.0,2.0);
		double exp=6.0;
		assertNotEquals(actual,exp, DELTA);
	}
}
