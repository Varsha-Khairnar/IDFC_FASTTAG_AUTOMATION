import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashBoardTesting {
	WebDriver driver;

@BeforeClass	
public void GetUrl() {

		System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
	}
	@Test
	public void EntreMobile_No() {
		driver.get("https://dev.ffetoll.idfcfirstbank.com/login");
	//open page and enter mobile no.
		
	//Enter mobile no.
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
	}
	@Test
	public void RequestOTP() {
		//click on request OTP
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
	}
	
	@Test
	public void Signin() {
		//click on Signin
	
		driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
		
	}
@Test
	public void Click_on_Continue() {

		// click on continue
		driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
	}

	@Test
	public void VerifyDashbordPage() {
		// open dashbard_view all registered vehicle

		driver.findElement(By.xpath("//div[@style='-webkit-line-clamp: 2; width: 140px;']")).click();
		System.out.println("dashboard page open successfully");
	}

	@Test
	public void Verify_Vehicle_no() {

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();

		System.out.println("click on vehihicle no. successfully");
	}

	@Test
	public void Verify_Recharge_Button() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div")).click();
		System.out.println("Click on Recharge  successfully");

	}

	@Test
	public void Recharge_Vehicle() {
		// select values from dropdown

		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/img")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-eipoio r-fontFamily-1t2iofm r-fontSize-ubezar'][normalize-space()='Choose Tag/Pool Acc']"));

		element.click();
		WebElement selectoption = driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-eipoio r-fontFamily-1t2iofm r-fontSize-ubezar'][normalize-space()='KA05NH2966']"));
		selectoption.click();
		System.out.println("vehicle no.picked from dropdown ");

	}

	@Test

	public void Quik_Add() {
		// Pick value from quik add
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[4]/div[1]/div[2]/div")).click();
		System.out.println("amount picked from quik add");
	}

	@Test

	public void Click_Recharge_Button() {
		// Click on recharge Buttondriver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-jwli3a r-fontFamily-1t2iofm r-fontSize-a023e6 r-fontWeight-1kfrs79']")).click();
		System.out.println("Recharge page successfully opened.");
	}

	@Test

	public void Click_Proccessed_Button() {
		// Click on Proccesed button
		driver.findElement(By.xpath("//div[@class='css-view-175oi2r r-transitionProperty-1i6wzkk r-userSelect-lrvibr r-cursor-1loqt21 r-touchAction-1otgn73 r-alignItems-1awozwy r-alignSelf-1kihuf0 r-backgroundColor-zj6i6j r-borderRadius-y47klf r-boxShadow-fd85ok r-height-1pi2tsx r-justifyContent-1777fci r-width-13qz1uu']")).click();
		System.out.println("click on Proccessed button successfully.");

	}

	@Test
	public void Click_OK_to_Proccessed() {
		// Click OK to proceed
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]")).click();
		System.out.println("click OK Proccessed successfully.");
	}

	@Test
	public void Choose_Payment_Option() {
		// choose a payment option

		String currentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}

	@Test
	public void Payment_Option() {
		// Perform actions on the new window

		driver.findElement(By.xpath("//div[@id='OPTNBK']//a[@class='payment-link paymentOption']")).click();

		System.out.println("Payment option page opened successfully.");
	}

	@Test
	public void Select_NetBanking() {

		// Select Bank (Dropdown-handel)

		WebElement p = driver.findElement(By.xpath("//select[@id='netbanking-select']"));
		p.click();
		Select dropdown = new Select(p);
		dropdown.selectByVisibleText("Avenues Test for New TC");
		System.out.println("Select Payment option Avenues Test for New TC successfully.");
	}

	@Test
	public void PayNow() {
		// Click on Pay Now
		WebElement paynow = driver.findElement(By.xpath("//div[@class='button-container']//a[@id='make-payment-net-banking']"));
		paynow.click();

		System.out.println("Clicke on Pay Now successfully.");
	}

	/*
	 * //((JavascriptExecutor) driver).
	 * executeScript("window.open('089cd23e6d2d2bc48bdf03bfbaa5964caba2dd383ddc417847034ae53e39eb9c9f436ed621646c7302f53a581e5ac42586cb07b5a73ebc04a3400d207e63a7f8db4b046b4be976661cdd3e2cb70e6c083557bf08406de35884e3d704cee3a97a7e4e0f4fd2759f291d48ed9efafbd9176b5eeb1f84a842c9e390246fd9fae26ef464341a43f78f70aaf99fcf4dbdc6e7f6b03ae810603c430936a39c18c32aef4eb1be7c7a4f11610f0ccc18309cd4da1f2281969034f63a34b8cad99a23dd1d4e6dab8fcae0ba2e156cfc832e1d9cae808c79177e90fb8c4a3681ec66e82ec4ef8b14c12a1833f6c29638a43bed8d4b79cc2e069638f6463e38a345e971256ad07e2b1b1dd0d794d7d6412244036a0a', '_blank');"
	 * ); driver.findElement(By.xpath(""]"))//.click(); Set<String> Handles =
	 * driver.getWindowHandles();
	 * 
	 * Iterator<String> it=Handles.iterator(); it.next(); String childid=(String)
	 * it.next(); driver.switchTo().window(childid); //ArrayList<String> tabs = new
	 * ArrayList<>(windowHandles); // Thread.sleep(3000); //
	 * driver.switchTo().window(tabs.get(1));
	 */

	@Test
	public void Recharge_Successful_Screenshot() throws IOException {
		File x = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\Lenovo\\Pictures\\Screenshots\\RechargeDon.png";
		File z = new File(path);
		FileHandler.copy(x, z);

		System.out.println("Click on Pay Now successfully.");

	}

}
