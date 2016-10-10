/**
 * 
 */
package Quiz3.Quiz_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author ashleyyoakam
 *
 */
public class triangleTest {

	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Triangle tester = new Triangle(3,4,5);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Triangle tester = new Triangle(3,4,5);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Triangle tester = new Triangle(3,4,5);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		Triangle tester = new Triangle(3,4,5);

	}

	
	
	@Test
	public void testAreaTrue() {
		assertTrue(tester.getArea()==6);
	}

	@Test
	public void testAreaFalse() {
		assertFalse(tester.getArea()==5);
	}

	@Test
	public void testPerimeterTrue() {
		assertTrue(tester.getPerimeter()==12);
	}

	@Test
	public void testPerimeterFalse() {
		assertFalse(tester.getPerimeter()==3);
	}
	
}
