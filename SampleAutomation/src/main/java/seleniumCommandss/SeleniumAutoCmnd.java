package seleniumCommandss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoCmnd {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		
		/*driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());//display the title
		System.out.println(driver.getCurrentUrl());//display the url
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();  //back to previous page
		driver.navigate().forward(); //to current page from previous page
		driver.navigate().refresh();*/
		
		driver.get("https://flipkart.com");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println("Hai");
		//driver.close();
		//driver.quit();

	}

}
