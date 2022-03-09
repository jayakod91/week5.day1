package week5.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClassTest {
	@Test
public void editLead() throws InterruptedException {

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("seenu");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=204562'])")).click();
	Thread.sleep(2000);
	System.out.println("The page title is  "+driver.getTitle());
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf Training Centre");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
	driver.close();

}
}