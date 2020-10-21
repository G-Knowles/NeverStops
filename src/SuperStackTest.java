import static org.junit.Assert.*;

import org.junit.Test;

public class SuperStackTest {

	@Test
	public void testIsEmpty() {
		// Create an empty stack and check if it is empty
		SuperStack<Integer> stack = new SuperStack<>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);
		
		// add a few elements and check if it is empty
		result = stack.push(new Integer(0));
		assertFalse(result);
		
	}

	@Test
	public void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testPop() {
		fail("Not yet implemented");
	}

}
