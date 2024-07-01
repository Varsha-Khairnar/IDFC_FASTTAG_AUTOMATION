import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class complete_Vehicle_recharge {
	
	WebDriver driver;
	
	@BeforeClass
		public void GETURL() throws InterruptedException {
		System.out.println("hello IDFC");	
		//setting properties
		System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				
		//Object creation
	 driver= new ChromeDriver();
	
	//Maximizing window
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
// Get URL
	driver.get("https://dev.ffetoll.idfcfirstbank.com/Login");
	
//for wait sometime
		Thread.sleep(3000);
		}
	@Test
	public void VerifyTitle() {
		String actualTitle=driver.getTitle();
		String expectedTitle="IDFC FIRST Bank FASTag";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	public void verifyLogo() {
		boolean flag =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[1]/div[1]/img")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
		
		public void SIGNIN() throws InterruptedException {
//open page and enter mobile no.
	Thread.sleep(3000);
	
//Enter mobile no.
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
	
	//click on request OTP
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
	
	//entre otp
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]")).click();

	//click on Signin
Thread.sleep(14000);
	driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
	Thread.sleep(5000);
	
	//click on continue
	driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
	
		}
	@Test
	 public void Select_Vehicle_for_Recharge() throws InterruptedException {
	//open dashbard_view all registered vehicle
	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@style='-webkit-line-clamp: 2; width: 140px;']")).click();
		
		
		//click on vehicle
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
	}
	@Test
	public void VerifyRcharge() throws InterruptedException {
		//Click on Recharge and verify r u able to do recharges or not.
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class=\"css-text-1rynq56 r-color-jwli3a r-fontFamily-otzu27 r-fontSize-a023e6 r-fontStyle-13uqrnb r-fontWeight-1kfrs79 r-letterSpacing-qoi5vj r-lineHeight-1f529hi r-textAlign-fdjqy7\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div")).click();
		
		
				
		//select values from dropdown
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/img")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-eipoio r-fontFamily-1t2iofm r-fontSize-ubezar'][normalize-space()='Choose Tag/Pool Acc']"));
		
		Thread.sleep(3000);
		element.click();
		WebElement selectoption = driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-eipoio r-fontFamily-1t2iofm r-fontSize-ubezar'][normalize-space()='KA05NH2966']"));
		selectoption.click();
		
		//Pick value from quik add
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/input[1]")).sendKeys("1");		
		
				
				//Click on recharge Button
		driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-jwli3a r-fontFamily-1t2iofm r-fontSize-a023e6 r-fontWeight-1kfrs79']")).click();
		
		
	
		Thread.sleep(3000);
		//Click on Proccesed button
		driver.findElement(By.xpath("//div[@class='css-view-175oi2r r-transitionProperty-1i6wzkk r-userSelect-lrvibr r-cursor-1loqt21 r-touchAction-1otgn73 r-alignItems-1awozwy r-alignSelf-1kihuf0 r-backgroundColor-zj6i6j r-borderRadius-y47klf r-boxShadow-fd85ok r-height-1pi2tsx r-justifyContent-1777fci r-width-13qz1uu']")).click();
		Thread.sleep(3000);	
				
		                
		                //Click OK to proceed
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]")).click();
		Thread.sleep(3000);
	
		//choose a payment option
		
		
		
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for
		(String windowHandle : allWindowHandles) {    
		if
		(!windowHandle.equals(currentWindowHandle)) {         
			driver.switchTo().window(windowHandle);        
		break;
		 } } 
		
		// Perform actions on the new window
		
		driver.findElement(By.xpath("//div[@id='OPTNBK']//a[@class='payment-link paymentOption']")).click();
		Thread.sleep(3000);
		
		
		//Select Bank (Dropdown-handel)
		Thread.sleep(3000);
		   WebElement p= driver.findElement(By.xpath("//select[@id='netbanking-select']"));
		   p.click();
		   Select dropdown = new Select(p);
		   dropdown.selectByVisibleText("Avenues Test for New TC");
		   Thread.sleep(3000);
		   //Click on Pay Now
		  WebElement paynow= driver.findElement(By.xpath("//div[@class='button-container']//a[@id='make-payment-net-banking']"));
		  paynow.click();
	}
		  
		
	
	@Test
	public void Takescreenshot() throws IOException, InterruptedException {
        //Takescreenshot
		   Thread.sleep(3000);
		   File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   String path="C:\\Users\\Lenovo\\Pictures\\Screenshots\\RechargeD.png";
		   File z = new File(path);
		   FileHandler.copy(x, z);
		   
		       System.out.println("SCREENSHOT CAPTURE SUCCESFULLY"); 
		       
		  
		   
	}

	}



