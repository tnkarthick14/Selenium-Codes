package week2.Day1.Irctc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelectIt {
	
	
	public WebElement choose(String item1,String item2) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();
		WebElement webElem = driver.findElementByXPath(item1);
		webElem.click();
		Select dropdown = new Select(webElem); 
		dropdown.selectByVisibleText(item2);
		return webElem;
	}

}
