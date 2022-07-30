package test_testNG;

import org.testng.annotations.Test;

// execution of number of tests by using priority and Invocation count
public class test_4 extends base_class {
 
	@Test(priority=3)
	public void test_1() {
		System.out.println("test_1");
		}
	
	@Test(priority=2)
	public void test_2() {
		System.out.println("test_2");
		}
	
	@Test(priority=1, invocationCount=3)
	public void test_3() {
		System.out.println("test_3");
		}
	
	@Test
	public void test_4() {
		System.out.println("test_4");
		}
	
	
}
