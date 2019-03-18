package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//To Maximize the opened chrome window 
		driver.manage().window().maximize();

		//Launches the IRCTC Website 
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement myelement = driver.findElementById("draggable");
		WebElement myelement1 = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(myelement).moveToElement(myelement1).perform();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
