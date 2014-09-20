package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void test1() {
		Main test1 = new Main();
		int result1 = test1.uscln(3, 6);
		assertEquals(3, result1);
	}
	@Test
	public void test2() {
		Main test2 = new Main();
		int result2 = test2.uscln(3, 6);
		assertEquals(2, result2);
	}
	@Test
	public void test3() {
		Main test3 = new Main();
		int result3 = test3.uscln(0, 1);
		assertEquals(1, result3);
	}
}
