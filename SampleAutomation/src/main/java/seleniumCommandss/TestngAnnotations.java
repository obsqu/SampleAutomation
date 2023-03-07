package seleniumCommandss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	//Test case1
			@Test
			public void test1()
			{
				System.out.println("test case 1");
			}
			
			//Test case 2
			@Test
			public void test2()
			{
				System.out.println("test case 2");
			}
			@BeforeMethod
			public void beforeMethod()
			{
				System.out.println("Before method");
			}
			
			@AfterMethod
			public void afterMethod()
			{
				System.out.println("After method");
			}
			
			@BeforeClass
			public void beforeClass()
			{
				System.out.println("Before class");
			}
			
			@AfterClass
			public void afterClass()
			{
				System.out.println("After class");
			}
			
			@BeforeTest
			public void beforeTest()
			{
				System.out.println("Before test");
			}
			
			@AfterTest
			public void afterTest()
			{
				System.out.println("After test");
			}

		


}
