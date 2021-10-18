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
	public void sholdReturnBuzzForOneHundred() {
		assertEquals("Buzz", FizzBuzz.getNumbers(100));
	}
	@Test
	public void checkis0() {
		assertEquals(FizzBuzz.getNumbers(0), ("0"));
	}
	
	@Test
	public void check1Is1() {
		assertEquals(FizzBuzz.getNumbers(1), ("1"));
	}
	
	@Test
	public void check3IsFizz() {
		assertEquals(FizzBuzz.getNumbers(3), ("Fizz"));
	}
	
	@Test
	public void check5IsBuzz() {
		assertEquals(FizzBuzz.getNumbers(5), ("Buzz"));
	}
	
	@Test
	public void checkmultipleOf3IsFizz() {
		assertEquals(FizzBuzz.getNumbers(6), ("Fizz"));
	}
	
	@Test
	public void checkmultipleOf5IsBuzz() {
		assertEquals(FizzBuzz.getNumbers(10), ("Buzz"));
	}
	
	@Test
	public void checkmultipleOf5And3IsBuzz() {
		assertEquals(FizzBuzz.getNumbers(15), ("FizzBuzz"));
	}
	

}
