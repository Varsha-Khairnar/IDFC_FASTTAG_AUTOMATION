import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dashboard_All_vehicles_redirection {
	WebDriver driver;

	@BeforeClass
	public void GETURL() throws InterruptedException {
		System.out.println("hello IDFC");
		System.setProperty("webdriver.chrome.driver",
				"F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://dev.ffetoll.idfcfirstbank.com/Login");
		Thread.sleep(2000);
	}
	@Test
	public void SIGNIN() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input"))
				.sendKeys("7028445287");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]")).click();
		// click on Signin
		Thread.sleep(14000);
		driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
		Thread.sleep(3000);
		// click on continue
		driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
	}

	@Test
	public void View_all_vehicle_Redirection() throws InterruptedException {
		// open dashbard_view all registered vehicle
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='-webkit-line-clamp: 2; width: 140px;']")).click();

	}

}