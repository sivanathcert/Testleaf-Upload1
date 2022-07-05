package Week4Day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		//Searching Iphone in Amazon search field

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

		// Collection mobile names in List WebElement

		List<WebElement> mobileNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		//Looping to retrieve mobile name

		for (WebElement eachMobile: mobileNames) {

			//Checking mobile name which contains only 128

			if(eachMobile.getText().contains("128")) {
				System.out.println(eachMobile.getText());
			}
		}
	}

}
