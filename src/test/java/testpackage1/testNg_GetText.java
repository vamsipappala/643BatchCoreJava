package testpackage1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testNg_GetText {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();
		String errorMsg = driver.findElement(By.className("formValidationMessage")).getText();
		System.out.println("Error message:"+errorMsg);
		driver.findElement(By.id("firstName")).sendKeys("testfirstName");
		driver.findElement(By.id("lastName")).sendKeys("testLastName");
		driver.findElement(By.id("emailAddress")).sendKeys("testemail@test.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("123-456-4565");
		driver.findElement(By.id("password")).sendKeys("abcd123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd123");
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
		
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("High School Student/Future Undergraduate Student");
//		
//		
//		
//		
//		emailAddress
//		phoneNumber
//		password
//		ConfirmPassword
//		country
//		name = attendeeType
	}
		
}
