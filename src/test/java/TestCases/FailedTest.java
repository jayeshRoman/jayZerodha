package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
	

	@Test
	public void method3() {
		System.out.println("Method3");
		Assert.assertEquals("Java", "Java", "If doesn't match = failed method3");
		System.out.println("Is method3 printing after passing");
		
	}
	
	@Test(groups = "Regression")
	public void method11() {
		System.out.println("Method11");
		Assert.assertEquals(121,  121, "If doesn't match = failed method1");
		System.out.println("Is method11 printing after failing");
	}
	
	@Test
	public void method4() {
		System.out.println("Method4");
		Assert.assertTrue(true);
	}
	
	@Test
	public void method5() {
		System.out.println("Method5");
		Assert.assertTrue(true);
	}
	
	@Test
	public void method2() {
		System.out.println("Method2");
		Assert.assertFalse(false);
	}
	
	@Test
	public void method6() {
		System.out.println("Method6");
		Assert.assertFalse(false);
	}
}
