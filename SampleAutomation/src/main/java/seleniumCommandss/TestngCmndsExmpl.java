package seleniumCommandss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngCmndsExmpl {
WebDriver driver;
	
	@BeforeClass
	public void prerun()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void launchUrl()
	{
		driver.get("https://www.flipkart.com");
	}
	
	@Test
	public void test()
	{
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","Failure occurs");
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}

}
