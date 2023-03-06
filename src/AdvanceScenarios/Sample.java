package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		List<WebElement> allList = driver.findElements(By.tagName("li"));

		for(WebElement wb:allList)
		{
			if(wb.getText().contains(""))
			{
				wb.click();
				break;
			}
		}
	}

}
