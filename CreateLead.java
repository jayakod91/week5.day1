package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClassTest {
	@Test
	public void createLead() {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sree");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mathi");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("4/04/1991");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04142");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9843740804");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("shurthi");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("nithiya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("jerry");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("4/5,udaiyar street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("SKS nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Cuddalore");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("607302");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("08");
		driver.findElement(By.name("submitButton")).click();


	}

}
