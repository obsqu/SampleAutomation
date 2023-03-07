package seleniumCommandss;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import org.testng.annotations.Test;

public class SwagLabsLink {
	
	
	

	@Test
	public void login() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		WebElement usrnm=driver.findElement(By.xpath("//input[@id='user-name']"));
		usrnm.sendKeys("standard_user");
		WebElement pswd=driver.findElement(By.xpath("//input[@id='password']"));
		pswd.sendKeys("secret_sauce");
		
		WebElement submitbt=driver.findElement(By.xpath("//input[@id='login-button']"));
		submitbt.click();
		boolean flaglog=submitbt.isDisplayed();
		Assert.assertFalse(flaglog,"Fail: login is still present");
		
		WebElement product=driver.findElement(By.xpath("//span[text()='Products']"));
		String header1=product.getText();
		Assert.assertEquals(header1,"PRODUCTS","Failure: unable to reach homepage");
		
		boolean flagpdt=product.isDisplayed();
		Assert.assertTrue(flagpdt,"Fail:Element is not displayed");
				
		capturePageScreenshot(driver);//calling the method
		
		//Assert.assertNull(header1,"Fail: header is not empty");
		//Assert.assertNotNull(header1,"Fail: header is empty");
		
	}
	
	/**Screencapturing and saving to the folder
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public void capturePageScreenshot(WebDriver driver) throws Exception{
		try {
			String filepath="C:\\Users\\DELL\\Desktop\\SeleniumScrnshot\\";
			String fileNm="FailedSS";
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(filepath+fileNm+".png"));
		}catch(Exception e) {
			throw new Exception("captureScreenshot :"+e.getMessage());
		}
	}

}
