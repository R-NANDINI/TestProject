package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	@BeforeClass
	public static void beforeclassmethod()
	{
		System.out.println("Before class");
	}
	@Before
	public void beforetestcase()
	{
		System.out.println("Before test case");
		
	}
	@Test
	public void test() 
	{
		//System.out.println("Your actual test case");
		assertEquals(4,FindResult.FindMaxNum(new int[] {1,2,3,4}));
		//assertEquals(0,FindResult.FindMaxNum(new int[] {1,2,3,4}));
		assertTrue(FindResult.EvenOrOdd(2));
		//assertTrue(FindResult.EvenOrOdd(3));
		//assertFalse(FindResult.EvenOrOdd(2));
		assertFalse(FindResult.EvenOrOdd(3));
		
	}
	@After
	public void aftertestcase()
	{
		System.out.println("After Test Case");
	}
	@AfterClass
	public static void afterclassmethod()
	{
		System.out.println("After class");
	}
}
