package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DH Healthcare");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DHIVAGAR");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAVI");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhiva");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhivagarr98@gmail.com");
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select load=new Select(State);
		load.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dedalus");
		driver.findElement(By.className("smallSubmit")).click();
		String Title1=driver.getTitle();
		System.out.println(Title1);
	}

}
