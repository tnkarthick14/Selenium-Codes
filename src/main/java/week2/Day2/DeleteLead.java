package week2.Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000); 
		//String text1 = driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").getText();
		 // System.out.println("Current Lead : " + text1);
		WebElement element1 = driver.findElementByXPath("//table[@class='x-grid3-row-table']//a");
		String text1 = element1.getText();
		System.out.println("Current Lead : " + text1);
		element1.click();
		//a[text()='Delete']
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		WebElement element2 = driver.findElementByXPath("//label[text()='Lead ID:']/following::input");
		element2.click();
		element2.sendKeys(text1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000); //
		String text2 = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']//div").getText();
		System.out.println("Search Results for " + text1 + " : " + text2);
		//driver.close();
		
	}

}
