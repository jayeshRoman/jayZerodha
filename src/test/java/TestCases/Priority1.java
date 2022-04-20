package TestCases;

import org.testng.annotations.Test;

public class Priority1 {
	
	@Test(enabled = true)
	public void method3() {
		System.out.println("Method3");
	}
	
	@Test(enabled = false)
	public void method1() {
		System.out.println("Method1");
	}
	
	@Test(enabled= true)
	public void method4() {
		System.out.println("Method4");
	}
	
	@Test(enabled=false)
	public void method5() {
		System.out.println("Method5");
	}
	
	@Test(enabled= true)
	public void method2() {
		System.out.println("Method2");
	}
}
