import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dashboard1 {

	WebDriver driver;

	@BeforeClass
	public void GetUrlSetUp() {

		System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://dev.ffetoll.idfcfirstbank.com/login");
	}
	@Test
	public void VerifyTitle() {
		String actualTitle=driver.getTitle();
		String expectedTitle="IDFC FIRST Bank FASTag";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

	@Test
	public void EntreMobile_No() {
		// open page and enter mobile no.

		// Enter mobile no.
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
	}

	@Test
	public void RequestOTP() throws InterruptedException {
		// click on request OTP

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
		Thread.sleep(15000);
	}

	@Test
	public void Signin() {
		// click on Signin

		driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();

	}

	@Test
	public void continiue() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
	}

	@Test
	public void Navigate_Recharge_Page() throws InterruptedException {
		//open dashbard_view all registered vehicle
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[5]/div")).click();
			
			
			//click on vehicle
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'KA05NH2966')]")).click();
			
			//Click on Recharge and verify r u able to do recharges or not.
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//div[@class=\"css-text-1rynq56 r-color-jwli3a r-fontFamily-otzu27 r-fontSize-a023e6 r-fontStyle-13uqrnb r-fontWeight-1kfrs79 r-letterSpacing-qoi5vj r-lineHeight-1f529hi r-textAlign-fdjqy7\"]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[1]/div[3]/div")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	