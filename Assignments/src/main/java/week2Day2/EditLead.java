package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement userElement = driver.findElement(By.id("username"));  // Enter username
		userElement.sendKeys("Demosalesmanager");

		WebElement passwordElement = driver.findElement(By.id("password"));  // Enter Password
		passwordElement.sendKeys("crmsfa");

		WebElement loginSubmit = driver.findElement(By.className("decorativeSubmit")); //Click login button
		loginSubmit.click();

		WebElement clickCrmSfaElement = driver.findElement(By.linkText("CRM/SFA")); //Click Link
		clickCrmSfaElement.click();

		WebElement CreateLeadElement = driver.findElement(By.linkText("Create Lead")); //Click Create Lead option
		CreateLeadElement.click();

		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName")); //Enter Company Name
		companyNameElement.sendKeys("Google INC");	

		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));   //Enter First Name
		firstNameElement.sendKeys("Sivanath");

		WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));   //Enter Last Name
		lastNameElement.sendKeys("N");

		WebElement lNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal")); //Enter Last Name (local)
		lNameLocalElement.sendKeys("Siva");

		WebElement deptNameElement = driver.findElement(By.id("createLeadForm_departmentName"));  //Enter Department Name
		deptNameElement.sendKeys("Healthcare");

		WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description")); // Enter Description
		descriptionElement.sendKeys("Welcome to Healthcare Department");

		WebElement emailIdElement = driver.findElement(By.id("createLeadForm_primaryEmail"));    // Enter Email ID
		emailIdElement.sendKeys("sivanath.cert@gmail.com");


		//Select State as Newyork ByVisibleText

		WebElement elementStateProvDd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));  
		Select ddStateProv = new Select(elementStateProvDd);
		ddStateProv.selectByVisibleText("New York");

		//Click Create Button

		WebElement clickCreateButton = driver.findElement(By.name("submitButton")); //Click login button
		clickCreateButton.click();

		WebElement clickEditButton = driver.findElement(By.linkText("Edit")); //Click login button
		clickEditButton.click();

		WebElement clearDescriptionElement = driver.findElement(By.id("updateLeadForm_description")); // Clear Description
		clearDescriptionElement.clear();

		WebElement ImpNoteElement = driver.findElement(By.id("updateLeadForm_importantNote")); // Enter Description
		ImpNoteElement.sendKeys("Imp note : This is Healthcare Department");

		WebElement clickUpdateButton = driver.findElement(By.name("submitButton")); //Click login button
		clickUpdateButton.click();

		//Get Title of the page

		System.out.println("The Title is : " + driver.getTitle());

	}

}
