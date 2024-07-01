import java.io.File;
import java.io.IOException;
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Recharge {
/*	WebDriver driver;
	@BeforeClass
	public void GetUrlSetUp() throws InterruptedException {

		
		//System.out.println("hello IDFC");	
		//setting properties
		System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//Object creation
	WebDriver driver= new ChromeDriver();
	
	//Maximizing window
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
// Get URL
	driver.get("https://dev.ffetoll.idfcfirstbank.com/Login");

	
//for wait sometime
		Thread.sleep(3000);
	}
		@Test
		public void EntreMobile_No() throws InterruptedException {
//open page and enter mobile no.
	Thread.sleep(3000);
	
//Enter mobile no.
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
		}
		
		
		@Test
		public void RequestOTP() throws InterruptedException {
	//click on request OTP
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
		}
		
		
		
		@Test
		public void Signin() throws InterruptedException {
	Thread.sleep(14000);
		//click on signin
		driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
		}
		
		
		@Test
		public void continiue() throws InterruptedException {
		Thread.sleep(5000);
		//click on continue
		driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
		
	
	
	
	
	
}}	
	
	
//***************************************************************************************************************	
	
@Test
public void Verify_Vehicle_no() throws InterruptedException {
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div/div[2]")).click();
	// Click on Recharge and verify r u able to do recharges or not.

	

	//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div")).click();

	System.out.println("click on vehicle no. successfully");
}

@Test
public void Verify_Recharge_Button() {

	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div")).click();
	System.out.println("Click on Recharge  successfully");

}

@Test
public void Recharge_Page() {
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
	// Click on recharge Button
	driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-jwli3a r-fontFamily-1t2iofm r-fontSize-a023e6 r-fontWeight-1kfrs79']")).click();
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
	WebElement paynow = driver
			.findElement(By.xpath("//div[@class='button-container']//a[@id='make-payment-net-banking']"));
	paynow.click();

	System.out.println("Click on Pay Now successfully.");
}

@Test
public void Recharge_Successful_Screenshot1() throws IOException {
	File x = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String path = "C:\\Users\\Lenovo\\Pictures\\Screenshots\\RechargeDo.png";
	File z = new File(path);
	FileHandler.copy(x, z);

	System.out.println("Screenshot taken successfully.");

}

// @AfterClass
public void EndTest() {

	driver.quit();

}
}

	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



