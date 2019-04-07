package week4.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.myntra.com/");
				//Maximizes the window 
				driver.manage().window().maximize();
				/*Alert alert1 = driver.switchTo().alert();
				alert1.dismiss();*/
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//driver.findElementByXPath("//a[text()='Men']").click();
				
				// Mouse Over on Men
				Actions builder = new Actions(driver);
				builder.moveToElement(driver.findElementByLinkText("Men")).perform();
				
	}

}
