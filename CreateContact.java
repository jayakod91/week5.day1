package week5.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseClassTest {
	@Test
	public void createContact () {

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		WebElement elementFirstName = driver.findElement(By.id("firstNameField"));
		elementFirstName.sendKeys("sri");
		driver.findElement(By.id("lastNameField")).sendKeys("mathi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("nithi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ISM");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Information System Management");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nithiyasri01@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj = new Select(state);
		obj.selectByVisibleText("USA");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Confidential");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Page title is : " + driver.getTitle());
	 

}
}
