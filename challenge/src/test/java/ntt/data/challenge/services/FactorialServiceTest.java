package ntt.data.challenge.services;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class FactorialServiceTest {

	FactorialService fs = new FactorialService();

	@Test
	public void factorialOfZeroShouldBeOne() {
		assertEquals(new BigInteger("1"), fs.getFactorial(0));
	}

	@Test
	public void factorialofOneShouldBeOne() {
		assertEquals(new BigInteger("1"), fs.getFactorial(1));
	}

	@Test
	public void factorialofNegativeShouldBeOne() {
		assertEquals(new BigInteger("1"), fs.getFactorial(-8));
	}

	@Test
	public void factorialof6ShouldBe720() {
		assertEquals(new BigInteger("720"), fs.getFactorial(6));
	}

}
