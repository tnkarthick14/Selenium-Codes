package week2.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUpNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//Launches the IRCTC Website 
		driver.get("https://www.irctc.co.in");

		//To Maximize the opened chrome window 
		driver.manage().window().maximize();

		//To Click the register button 
		driver.findElementByLinkText("REGISTER").click();

		//To select the username field 
		driver.findElementByXPath("//input[@id='userName']").sendKeys("sampletestleaf123");

		//To Enter Password 
		driver.findElementByXPath("//input[@id='usrPwd']").sendKeys("Testleaf123"); 

		//To confirm the entered Password 
		driver.findElementByXPath("//input[@id='cnfUsrPwd']").sendKeys("Testleaf123");

		//Invoking method to select dropdown webelement and storing in a local variable securityqn

		WebElement secqn = driver.findElementByXPath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]");
		secqn.click();
		WebElement secqn1 = driver.findElementByXPath("//span[text()='Who was your Childhood hero?']");
		secqn1.click();
		/*
		//Invoking Select Class using Object Dropdown and passing the variable securityqn
		Select dropdown = new Select(secqn); 
		dropdown.selectByVisibleText("Who was your Childhood hero?");

		 */

		//To Select Security Answer field and enter text
		driver.findElementByXPath("//input[@formcontrolname='secAns']").sendKeys("MyDad");

		//Invoking method to select dropdown webelement and storing in a local variable preflang
		WebElement preflang = driver.findElementByXPath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[2]");
		preflang.click();

		WebElement preflang1 = driver.findElementByXPath("//span[text()='English']");
		preflang1.click();

		/* Invoking Select Class using Object Dropdown1 and passing the variable preflang
		Select dropdown1 = new Select(preflang);
		dropdown1.selectByVisibleText("English");
		*/

		//To Select First Name field 
		driver.findElementByXPath("//input[@id='firstName']").sendKeys("Babu");

		//To Select Second Name field 
		driver.findElementByXPath("//input[@id='lastname']").sendKeys("Manickam");

		//To Select Gender 
		driver.findElementByXPath("//input[@id='M']").click();
		
		//To Select DOB
		WebElement webElement1 = driver.findElementByXPath("//p-calendar[@formcontrolname='dob']");
		webElement1.click();
		
		WebElement webElement2 = driver.findElementByCssSelector("//ui-datepicker-month ng-tns-c13-7 ng-star-inserted");
		webElement2.click();
		Select dropdown2 = new Select(webElement2);
		dropdown2.selectByIndex(2);
		webElement2.click();
		
		/*
		WebElement webElement3 = driver.findElementByXPath("//select[@class='ui-datepicker-year ng-tns-c14-31 ng-star-inserted']");
		webElement3.click();
		Select dropdown3 = new Select(webElement3);
		dropdown3.selectByVisibleText("1994");
		
		WebElement webElement4 = driver.findElementByXPath("(//td[@class='ng-tns-c14-31 ng-star-inserted'])[14]");
		webElement4.click();
		
		*/
		





	}

}
