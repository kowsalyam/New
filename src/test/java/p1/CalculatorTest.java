package p1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;
	@Before
	public void setUp() throws Exception {
		cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		cal=null;
	}

	@Test
	public void testadd() {
		assertEquals(8,cal.add(5,3));
	}
	@Test
	public void testsub() {
		assertEquals(1,cal.sub(5,3));
	}
}
