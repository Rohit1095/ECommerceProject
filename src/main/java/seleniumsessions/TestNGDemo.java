package seleniumsessions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test demo");
	}
	
	@Test
	public void test() {
		System.out.println("Test NG demo");
		
	}
	
}
