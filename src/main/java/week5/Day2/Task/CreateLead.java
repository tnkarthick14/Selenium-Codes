package week5.Day2.Task;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.Day1.Task.MyUtil.ProjectMethod;

public class CreateLead extends ProjectMethod  {
	@Test(dataProvider="fetchData")
	public void cLead(String cname,String fname,String lname,String email) throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Create Lead : " + title);
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(email);
		driver.findElementByClassName("smallSubmit").click();
		String title2 = driver.getTitle();
		System.out.println("Create Lead : " + title2);
		driver.findElementByLinkText("opentaps").click();
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(1000);

		}
	
	

	

}
