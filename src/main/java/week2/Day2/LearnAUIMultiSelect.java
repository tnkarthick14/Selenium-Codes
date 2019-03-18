package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUIMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//To Maximize the opened chrome window 
		driver.manage().window().maximize();

		//Launches the IRCTC Website 
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement myelement2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement myelement6 = driver.findElementByXPath("//li[text()='Item 6']");
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(myelement2).click(myelement6).perform();
		//This also works
		//builder.sendKeys(Keys.CONTROL).click(myelement2).click(myelement6).perform();
		Thread.sleep(3000);

		driver.close();
	}

}
