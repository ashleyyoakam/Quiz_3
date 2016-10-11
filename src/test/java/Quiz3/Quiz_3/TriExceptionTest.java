package Quiz3.Quiz_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.TriangleException;

public class TriExceptionTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ExceptionTest() throws TriangleException {
		try{
			Triangle testTri=new Triangle(3,4,50);
		}
		catch(TriangleException e){
			throw e;
		}
		fail("Not yet implemented");
	}

}
