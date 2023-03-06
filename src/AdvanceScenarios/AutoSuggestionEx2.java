package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("puma");
		 List<WebElement> list = driver.findElements(By.tagName("li"));
		
		 Thread.sleep(2000);
		for(WebElement wb:list)
		{
			System.out.println(wb.getText());
			if(wb.getText().contains(" slippers men"))
			{
				 Thread.sleep(1000);
				wb.click();
				break;
			}
		}
		
		
	}

}
