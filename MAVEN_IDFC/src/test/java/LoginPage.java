import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	static WebDriver driver;
		@Test
		public static void GetURL() {
			System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			//Object creation
		WebDriver driver= new ChromeDriver();
		
		//Maximizing window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	// Get URL
		driver.get("https://dev.ffetoll.idfcfirstbank.com/Login");
			System.out.println("URL navigate Successfully ");
		}
		public static void LoginPage() {
		//Enter mobile no.
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
		
		//click on request OTP
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
		
		//entre otp
	
		driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]"));//.sendKeys("294624");

		//click on Signin

		driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
		
		
		
		}
		
		
		
		
		
		
		
		
		
		

	}


