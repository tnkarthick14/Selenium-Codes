package week5.Day1.Task1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		String title = driver.getTitle();
		System.out.println("Create Lead : " + title);
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Google");
		driver.findElementById("createLeadForm_firstName").sendKeys("Karthick");
		driver.findElementById("createLeadForm_lastName").sendKeys("T N");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test123@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		String title2 = driver.getTitle();
		System.out.println("Create Lead : " + title2);
		driver.findElementByLinkText("opentaps").click();
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.close();




	}

}
