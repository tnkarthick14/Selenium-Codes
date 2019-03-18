package week2.Day1;

import java.awt.RenderingHints.Key;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//Launches the IRCTC Website 
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		//To Maximize the opened chrome window 
		driver.manage().window().maximize();

		//To Click the register button 
		//driver.findElementByLinkText("REGISTER").click();

		//To select the username field 
		driver.findElementByXPath("//input[@id='userRegistrationForm:userName']").sendKeys("sampletestleaf123");

		//To Check availability : 
		driver.findElementByXPath("//a[text()='Check Availability']").click();


		//To Enter Password 
		driver.findElementByXPath("//input[@id='userRegistrationForm:password']").sendKeys("Testleaf123"); 

		//To confirm the entered Password 
		driver.findElementByXPath("//input[@id='userRegistrationForm:confpasword']").sendKeys("Testleaf123");

		//Invoking method to select dropdown webelement and storing in a local variable securityqn
		//@SuppressWarnings("unused")
		//IrctcSignUPSelect select1 = new IrctcSignUPSelect("//select[@id='userRegistrationForm:securityQ']","Who was your Childhood hero?");

		WebElement secqn = driver.findElementByXPath("//select[@id='userRegistrationForm:securityQ']");
		secqn.click();
		Select dropdown = new Select(secqn); 
		dropdown.selectByVisibleText("Who was your Childhood hero?");

		/*
			//Invoking Select Class using Object Dropdown and passing the variable securityqn
			Select dropdown = new Select(secqn); 
			dropdown.selectByVisibleText("Who was your Childhood hero?");

		 */

		//To Select Security Answer field and enter text
		driver.findElementByXPath("//input[@id='userRegistrationForm:securityAnswer']").sendKeys("MyDad");

		//Invoking method to select dropdown webelement and storing in a local variable preflang
		//@SuppressWarnings("unused")
		//IrctcSignUPSelect select2 = new IrctcSignUPSelect("//select[@id='userRegistrationForm:prelan']","English");
		WebElement preflang = driver.findElementByXPath("//select[@id='userRegistrationForm:prelan']");
		preflang.click();
		Select dropdown1 = new Select(preflang); 
		dropdown1.selectByVisibleText("English");

		//To Select First Name field 
		driver.findElementByXPath("//input[@id='userRegistrationForm:firstName']").sendKeys("Babu");

		//To Select Second Name field 
		driver.findElementByXPath("//input[@id='userRegistrationForm:lastName']").sendKeys("Manickam");

		//To Select Gender 
		driver.findElementByXPath("(//input[@value='M'])[1]").click();

		//To Select Marital Status 
		driver.findElementByXPath("(//input[@value='M'])[2]").click();

		// To Select DOB
		WebElement dobd = driver.findElementByXPath("//select[@id='userRegistrationForm:dobDay']");
		dobd.click();
		Select dropdown2 = new Select(dobd); 
		dropdown2.selectByValue("14");
		dobd.click();

		WebElement dobm = driver.findElementByXPath("//select[@id='userRegistrationForm:dobMonth']");
		dobm.click();
		Select dropdown3 = new Select(dobm); 
		dropdown3.selectByVisibleText("NOV");
		dobm.click();

		WebElement doby = driver.findElementByXPath("//select[@id='userRegistrationForm:dateOfBirth']");
		doby.click();
		Select dropdown4 = new Select(doby); 
		dropdown4.selectByVisibleText("1994");
		doby.click();



		//To Select occupation : 
		WebElement occup = driver.findElementByXPath("//select[@id='userRegistrationForm:occupation']");
		occup.click();
		Select dropdown5 = new Select(occup); 
		dropdown5.selectByVisibleText("Private");  

		//To Select country : 
		WebElement country = driver.findElementByXPath("//select[@id='userRegistrationForm:countries']");
		country.click();
		Select dropdown6 = new Select(country); 
		dropdown6.selectByVisibleText("India");

		//to enter email id : 
		driver.findElementByXPath("//input[@id='userRegistrationForm:email']").sendKeys("babumanickam@testleaf.com"); 

		//to enter mobile : 
		driver.findElementByXPath("//input[@id='userRegistrationForm:mobile']").sendKeys("9191919191"); 

		//To Select Nationality : 
		WebElement nationality = driver.findElementByXPath("//select[@id='userRegistrationForm:nationalityId']");
		nationality.click();
		Select dropdown7 = new Select(nationality); 
		dropdown7.selectByVisibleText("India");
		nationality.click();

		//To Enter Address 
		driver.findElementByXPath("//input[@id='userRegistrationForm:address']").sendKeys("India");

		//To Enter Pincode and press Tab
		driver.findElementByXPath("//input[@id='userRegistrationForm:pincode']").sendKeys("600042",Keys.TAB);
		Thread.sleep(3000);

		//To Enter City name : 
		WebElement city = driver.findElementByXPath("//select[@id='userRegistrationForm:cityName']");
		city.click();
		Select dropdown8 = new Select(city);
		dropdown8.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		//To Select PO : 
		WebElement post = driver.findElementByXPath("//select[@id='userRegistrationForm:postofficeName']");
		post.click();
		Select dropdown9 = new Select(post);
		dropdown9.selectByVisibleText("Velacheri S.O");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Y']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='userRegistrationForm:landline']").sendKeys("9191919191");
		System.out.println("Hurray!!! It worked ");
		driver.close();






	}

}
