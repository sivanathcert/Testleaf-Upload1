package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");

		driver.manage().window().maximize();
		
		// Enter Email ID
		
		WebElement emailIdElement = driver.findElement(By.id("email"));    
		emailIdElement.sendKeys("sivanath.cert@gmail.com");

		
		// Is disabled?
		
		//System.out.println(driver.find("//*[@id='contentblock']/section/div[5]/div/div/input").isEnabled());
		
	}

}
