package TestAzure_Devops.TestAzure_Devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {
	
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    driver.findElement(By.id("username")).sendKeys("student");
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.id("submit")).click();
	    
	
	}

}
