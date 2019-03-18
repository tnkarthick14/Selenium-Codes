package week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//To Maximize the opened chrome window 
		driver.manage().window().maximize();

		//Launches the IRCTC Website 
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU",Keys.TAB);

		//CheckBox Verification 
		WebElement CheckBox = driver.findElementById("chkSelectDateOnly");
		if(CheckBox.isSelected()) {
			driver.findElementById("chkSelectDateOnly").click();
		}
		Thread.sleep(2000);
		//find the table 
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		//go to rows 
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Row Count : " + rows.size());
		//for to get each row from table 
		for (WebElement roweach : rows) {
			//get columns from each row 
			List<WebElement> columns = roweach.findElements(By.tagName("td"));
			System.out.println(columns.get(1).getText() + " Time : " + columns.get(3).getText());	
		}
		
		driver.close();

	}

}
