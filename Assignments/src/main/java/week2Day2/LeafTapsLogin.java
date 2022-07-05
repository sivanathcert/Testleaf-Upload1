package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {

	public static void main(String[] args) {
		//Chrome Driver Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement userElement = driver.findElement(By.id("username"));
		userElement.sendKeys("Demosalesmanager");

		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");

		WebElement loginSubmit = driver.findElement(By.className("decorativeSubmit"));
		loginSubmit.click();

		//logout

		/*	WebElement logoutSubmit = driver.findElement(By.className("decorativeSubmit"));
		logoutSubmit.click();
		 */

		WebElement clickCrmSfaElement = driver.findElement(By.linkText("CRM/SFA"));
		clickCrmSfaElement.click();
		
		WebElement CreateLeadElement = driver.findElement(By.linkText("Create Lead"));
		CreateLeadElement.click();
		
		//Select value from DD list through sendkeys
		
				WebElement elementSourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
				// elementSourceDropDown.sendKeys("Direct Mail");
				
				//Select value from DD list selectByIndex, ByVisibleText, ByValue
				
				Select ddm = new Select(elementSourceDropDown );
				//ddm.selectByIndex(1);
				//ddm.selectByValue("LEAD_EXISTCUST");
				ddm.selectByVisibleText("Public Relations");

	}

}
