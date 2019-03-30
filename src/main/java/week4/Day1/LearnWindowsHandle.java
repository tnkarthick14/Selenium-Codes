package week4.Day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowsHandle {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Invoking Built in ChromeDriver Class using object driver to launch Chrome driver
		ChromeDriver driver = new ChromeDriver();

		//Launches the IRCTC Website 
		driver.navigate().to("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//To Maximize the opened chrome window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		
		// TO Select the index of the opened windows.
		Set<String> Mywindows = driver.getWindowHandles();
		List<String> ListWindow = new ArrayList<>();
		ListWindow.addAll(Mywindows);
		
		//To Switch to the second window 
		driver.switchTo().window(ListWindow.get(1));
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement Element1 = driver.findElementByXPath("//p[text()='Barakhamba Road, New Delhi 110001.']");
		String text1 = Element1.getText();
		if(text1.contains("New Delhi"))
			System.out.println("yaay it is there ");
		else
			System.out.println("it is not there");
		
		driver.switchTo().window(ListWindow.get(0));
		
		//To Take screenshot and save it in a file 
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img.jpeg");
		FileUtils.copyFile(src, desc);
		
		driver.close();
		
	}

}
