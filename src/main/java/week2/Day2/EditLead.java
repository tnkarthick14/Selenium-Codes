package week2.Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title); 
		WebElement click1 = driver.findElementByXPath("//span[text()='Company Name']/following::input");
		System.out.println("Company Name : " );
		String text = click1.getText();
			click1.clear();
		click1.sendKeys("Microsoft");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		WebElement click2 = driver.findElementByXPath("//span[text()='Company Name']/following::input");
		Thread.sleep(1000);
		System.out.println("Changed Company Name : " + click2.getText());
		
		driver.close();
		
		
		
		
		
		
	}

}
