package week5.Day1.Task;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import week5.Day1.Task.MyUtil.ProjectMethod;

public class CreateLead extends ProjectMethod  {
	@Test(priority=1)
	public void cLead() throws InterruptedException {
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
		Thread.sleep(1000);
		




	}

}
