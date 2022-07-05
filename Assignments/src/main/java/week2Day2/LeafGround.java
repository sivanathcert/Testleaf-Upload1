package week2Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();
		
		//Select value from DD list selectByIndex, ByVisibleText, ByValue
		
		WebElement elementDropDown1 = driver.findElement(By.id("dropdown1"));
		Select ddm1 = new Select(elementDropDown1);
		ddm1.selectByIndex(1);

		WebElement elementDropDown2 = driver.findElement(By.name("dropdown2"));
		Select ddm2 = new Select(elementDropDown2);
		ddm2.selectByVisibleText("Appium");
		
		WebElement elementDropDown3 = driver.findElement(By.name("dropdown3"));
		Select ddm3 = new Select(elementDropDown3);
		ddm3.selectByValue("3");

		/*WebElement elementDropDown4 = driver.findElement(By.name("dropdown4"));
		Select ddm4 = new Select(elementDropDown4);
		ddm4.getFirstSelectedOption();
		
		
		WebElement elementDropDown5 = driver.findElement(By("sendKeys"));
		elementDropDown5.sendKeys("Loadrunner");
		
		//Doubt : Dropdown 4 & 5 and multiple select list */
		
	
	}

}
