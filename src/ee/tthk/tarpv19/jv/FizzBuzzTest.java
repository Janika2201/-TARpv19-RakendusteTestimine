package ee.tthk.tarpv19.jv;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	void sholdReturOneHondredNumbers() {
		FizzBuzz fb=new FizzBuzz();
		assertEquals(100,fb.getNumbers());
	}
	

}
