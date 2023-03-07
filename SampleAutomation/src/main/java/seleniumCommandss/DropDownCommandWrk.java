package seleniumCommandss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommandWrk {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/seleniumHtml/samplehtml.html");
		//single drop down selection
		WebElement lan=driver.findElement(By.id("nm"));
		
		Select sel=new Select(lan);//select class is used for drop down 
		//sel.selectByIndex(2);
		
		sel.selectByVisibleText("Java");
		
		//sel.selectByValue("c++");
		
		//for multiple drop down selection
		
        WebElement lan1=driver.findElement(By.id("nm1"));
		
		Select sel1=new Select(lan1);
		sel1.selectByIndex(2);
		
		sel1.selectByVisibleText("Java");
		
		sel1.selectByValue("c++");
		System.out.println("Hai");
		//sel.deselectByValue("c++");
		//for deselecting the values all
		//sel.deselectAll();
		
	/*	List<WebElement> list=sel1.getAllSelectedOptions();
		for(WebElement option:list)
		{
			
			System.out.println(option.toString());//display all the selected datas id
	        System.out.println(option.getText());	//display the value of the data in select option instead of id
		}
		*/
		//System.out.println("first selected :"+sel1.getFirstSelectedOption().getText());


	}

}
