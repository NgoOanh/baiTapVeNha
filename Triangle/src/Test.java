import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test1() {
		function A= new function();
		String result = A.triangle(1, 2, 3);
		assertEquals("Not A Triangle", result);
	}

	@org.junit.Test
	public void test2() {
		function A= new function();
		String result = A.triangle(3, 2, 3);
		assertEquals("Not A Triangle", result);
	}

}
