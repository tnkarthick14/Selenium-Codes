package week4.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//Launches the IRCTC Website 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		//To Maximize the opened chrome window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Webelement1 = driver.findElementById("iframeResult");
		driver.switchTo().frame(Webelement1);
		WebElement Webelement2 = driver.findElementByXPath("//button[text()='Try it']");
		Webelement2.click();
		Alert alert1 = driver.switchTo().alert();
		String Name1 = " End Game " ;
		alert1.sendKeys(Name1);
		alert1.accept();
		String Name2 = driver.findElementById("demo").getText();
		if (Name2.contains(Name1)) {
			System.out.println(" Hurray !! it matched ");
		} else {
			System.out.println("Bad Luck !! it didn't match ");
		}
		
		//driver.close();
		
		


	}

}
