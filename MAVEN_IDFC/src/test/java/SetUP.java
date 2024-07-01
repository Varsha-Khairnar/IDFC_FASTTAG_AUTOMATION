import java.time.Duration;

import org.openqa.selenium.By;

/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SetUP {
	
		WebDriver driver ;
		@BeforeMethod
		public void GetUrl() {
			
			System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			//Maximizing window
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			//get url
			  driver.get("https://dev.ffetoll.idfcfirstbank.com/login");
			
			//click on continue
				driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
		}
		@Test
		public void verifyTitle() {
			String actualTitle=driver.getTitle();
			String expectedTitle=" IDFC FIRST Bank FASTag"; 
			//for checking test case we have to use assertion
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		
		@Test
		public void VerifyLoginPage() {
			//open page and enter mobile no.
			
		//Enter mobile no.
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
			System.out.println("Mobile number entered successfully");
			
			//click on request OTP
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
			System.out.println("OTP received on mobile no.");
			//entre otp
			
			driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]"));//.sendKeys("294624");
			System.out.println("OTP entered successfully");
			
			//click on Signin
			
			driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
			System.out.println("Click on Signin button successfully");
			
			
		
		//click on statement
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Statement')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}      */
