package week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeadBase4 {

	public static void main(String[] args) throws InterruptedException {
		// Set System Property to know which drive used 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Launches the Chrome browser
		ChromeDriver driver = new ChromeDriver();

		//Maximizes the window 
		driver.manage().window().maximize();

		// Navigates to the URL 
		driver.navigate().to("http://leaftaps.com/opentaps");

		//To implicitly wait for all findelement and findelements function in the code ( only one declaration is enough ) 

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		//Click on the Leads Link : Xpath - //a[text()='Leads']
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Leads']").click();

		//Click Merge Lead : Xpath -  //a[text()='Merge Leads']

		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		Thread.sleep(1000);

		//To Click on Image near From Lead : Xpath - //input[@id='ComboBox_partyIdFrom']/following::img
		driver.findElementByXPath("//input[@id='ComboBox_partyIdFrom']/following::img").click();

		//To get the number of windows session open  and store the returned session id as collection set of String object
		Set<String> windowHandles = driver.getWindowHandles();

		//Create a ListArray object and store the values from the set as only List has getIndex function
		List<String> ls = new ArrayList<>();

		//Save the Set in List
		ls.addAll(windowHandles);
		System.out.println("\n"+"Set Values  : " + windowHandles);
		System.out.println("List Values : " + ls);

		//To Switch to next window : 
		driver.switchTo().window(ls.get(1));

		//Click on find leads  : xpath - //button[text()='Find Leads']
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("(//label[text()='Email Address:']/following::input)[1]").sendKeys("test123@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);

		//Select the first Field  : Xpath - (//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a
		WebElement Element1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text1 = Element1.getText();
		Element1.click();
		Thread.sleep(2000);

		driver.switchTo().window(ls.get(0));

		//To Click on Image near To Lead : Xpath - //input[@id='ComboBox_partyIdFrom']/following::img
		driver.findElementByXPath("//input[@id='ComboBox_partyIdTo']/following::img").click();

		//To get the number of windows session open  and store the returned session id as collection set of String object
		windowHandles.addAll(driver.getWindowHandles());
		ls.clear();
		ls.addAll(windowHandles);
		Thread.sleep(2000);

		/*//Create a ListArray object and store the values from the set as only List has getIndex function
		List<String> ls1 = new ArrayList<>();

		//Save the Set in List
		ls1.addAll(windowHandles1);

		System.out.println(ls1); */

		//To Switch to next window : 
		System.out.println("Set Values  : " + windowHandles);
		System.out.println("List Values : " + ls);
		driver.switchTo().window(ls.get(2));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		//Click on find leads  : xpath - //button[text()='Find Leads']
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("(//label[text()='Email Address:']/following::input)[1]").sendKeys("test123@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(500);

		//Select the first Field and Click : Xpath - (//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
		Thread.sleep(500);

		//To Switch to next window : 
		driver.switchTo().window(ls.get(0));
		Thread.sleep(500);

		//To Click on Merge : xpath - //a[text()='Merge']
		driver.findElementByXPath("//a[text()='Merge']").click();

		//Switch to Alert and accept : 
		driver.switchTo().alert().accept();

		//Click on find lead : Xpath - //a[text()='Find Leads']
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);

		//Enter From Lead Id : xpath - (//label[text()='Lead ID:']/following::input)[1]
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(text1);

		//Click on find Lead : xpath - //button[text()='Find Leads']
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(500);

		//Verify the error message : xpath - (//table[@class='x-btn-wrap x-btn x-btn-text-icon']/following::div)[1]
		System.out.println(driver.findElementByXPath("(//table[@class='x-btn-wrap x-btn x-btn-text-icon']/following::div)[1]").getText());

		driver.close();


	}

}
