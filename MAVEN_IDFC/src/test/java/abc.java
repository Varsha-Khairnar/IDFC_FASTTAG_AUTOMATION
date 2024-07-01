import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class abc {
WebDriver driver;
	

	@BeforeClass
	public void GetUrlSetUp() {

		System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://dev.ffetoll.idfcfirstbank.com/login");
	}
	
	
	@Test
	public void EntreMobile_No() {
	//open page and enter mobile no.
		
	//Enter mobile no.
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
	}
	@Test
	public void RequestOTP() throws InterruptedException {
		//click on request OTP
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
		Thread.sleep(20000);
	}
	
	@Test
	public void Signin() throws InterruptedException {
		//click on Signin3
	
		driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
		Thread.sleep(5000);
	}
@Test
	public void Click_on_Continue() throws InterruptedException {
	
	//click on continue
	WebElement Continue = driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]\""));
			Continue.click();
	Thread.sleep(5000);
	}

}
