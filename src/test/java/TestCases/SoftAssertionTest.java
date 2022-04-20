package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	
	@Test
	public void test1()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Test1 started");
		s.assertEquals("Automation","Automation1" ,"does it failed?");
		System.out.println("Soft Assert works after failing");
		s.assertEquals(200, 200);
		System.out.println("soft asserts works for passing");
		s.assertFalse(true,"Failed");
		System.out.println("soft assert works after failed ");
		System.out.println("*****************************`");
		s.assertAll();
	}
	
	@Test
	public void test2()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Test2 started");
		s.assertEquals("Harry", "Harry", "does it failed?");
		System.out.println("Soft assert works after passing");
        s.assertTrue(false, "its failing");	
        System.out.println("Soft assert works after failing");
        s.assertAll();
	}
	

}
