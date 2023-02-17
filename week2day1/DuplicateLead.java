package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Company");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ABirami");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvam");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abi");
driver.findElement(By.name("departmentName")).sendKeys("Manual");
driver.findElement(By.name("description")).sendKeys("Manual and automation testing done here");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(("abcd@yahoo.com"));

WebElement source =
driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

Select option = new Select(source);

option.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();

driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC LTD");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abi.S");
driver.findElement(By.className("smallSubmit")).click();
System.out.println("Happy ending"+driver.getTitle());




}

}
