package week5.Day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import myUtils.ProjectMethods;

public class CreateLead extends ProjectMethods{
	@Test
	public void cLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Google");
		driver.findElementById("createLeadForm_firstName").sendKeys("Karthick");
		driver.findElementById("createLeadForm_lastName").sendKeys("T N");
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(Industry);
		dropdown.selectByVisibleText("Finance");
		List<WebElement> listid = dropdown.getOptions();
		for (WebElement samplelist : listid) {
			String text = samplelist.getText();
			System.out.println(text);
		}

		driver.findElementByClassName("smallSubmit").click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElementByLinkText("opentaps").click();
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.close();




	}

}
