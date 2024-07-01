import java.io.File;
import java.io.IOException;
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
import org.testng.annotations.Test;

public class abcd {
	
	WebDriver driver;
	@BeforeClass
	public void GetURL() throws IOException, InterruptedException {
		

			System.setProperty("webdriver.chrome.driver","F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://dev.ffetoll.idfcfirstbank.com/login");
			//open page and enter mobile no.
			Thread.sleep(2000);
	}
	@Test
				public void SignIN() throws InterruptedException {
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
			
	
			//click on request OTP
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
			
			//entre otp
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]")).click();
				
	
			//click on Signin
		Thread.sleep(14000);
			driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
			//click on continue
			Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/div")).click();
	}
			//click on continue
			//driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
				
	@Test
				public void view_all_registered_vehicle() throws InterruptedException {
			//open dashbard_view all registered vehicle
			Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div[1]/div[1]/div[1]/div")).click();
				
				//click on vehicle
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[3]/div[2]/div[1]/div[2]/div/div/div/div/div/div/div[2]")).click();
}
	@Test
				public void Click_Recharge() throws InterruptedException {
				//Click on Recharge and verify r u able to do recharges or not.
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-jwli3a r-fontFamily-otzu27 r-fontSize-a023e6 r-fontStyle-13uqrnb r-fontWeight-1kfrs79 r-letterSpacing-qoi5vj r-lineHeight-1f529hi r-textAlign-fdjqy7']")).click();
				
				}
	@Test
				
				public void Select_Vehicle_from_dropdown() throws InterruptedException {
				//select values from dropdown
				Thread.sleep(3000);
				WebElement element = driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-eipoio r-fontFamily-1t2iofm r-fontSize-ubezar'][normalize-space()='Choose Tag/Pool Acc']"));
				
				Thread.sleep(3000);
				element.click();
				WebElement selectoption = driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-eipoio r-fontFamily-1t2iofm r-fontSize-ubezar'][normalize-space()='KA05NH2966']"));
				selectoption.click();
				}
	@Test
				public void EnterAMT_For_Recharge() {
				
				//Pick value from quik add
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/input[1]")).sendKeys("1");
				
				}
	@Test
				public void Click_ON_Recharge() throws InterruptedException {
						//Click on recharge Button
				driver.findElement(By.xpath("//div[@class='css-text-1rynq56 r-color-jwli3a r-fontFamily-1t2iofm r-fontSize-a023e6 r-fontWeight-1kfrs79']")).click();
				Thread.sleep(3000);
				}
	@Test
				public void Click_On_Proccessed() throws InterruptedException {

				
				//Click on Proccesed button
				driver.findElement(By.xpath("//div[@class='css-view-175oi2r r-transitionProperty-1i6wzkk r-userSelect-lrvibr r-cursor-1loqt21 r-touchAction-1otgn73 r-alignItems-1awozwy r-alignSelf-1kihuf0 r-backgroundColor-zj6i6j r-borderRadius-y47klf r-boxShadow-fd85ok r-height-1pi2tsx r-justifyContent-1777fci r-width-13qz1uu']")).click();
				Thread.sleep(3000);	
				}
	@Test
				public void Click_OK_procced() throws InterruptedException {

						
				                
				                //Click OK to proceed
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]")).click();
				Thread.sleep(3000);
				}
	@Test
				
				
				public void choose_a_payment_option() throws InterruptedException {

				
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
				  
				   Thread.sleep(3000);
				}

			/*	  //((JavascriptExecutor) driver).executeScript("window.open('089cd23e6d2d2bc48bdf03bfbaa5964caba2dd383ddc417847034ae53e39eb9c9f436ed621646c7302f53a581e5ac42586cb07b5a73ebc04a3400d207e63a7f8db4b046b4be976661cdd3e2cb70e6c083557bf08406de35884e3d704cee3a97a7e4e0f4fd2759f291d48ed9efafbd9176b5eeb1f84a842c9e390246fd9fae26ef464341a43f78f70aaf99fcf4dbdc6e7f6b03ae810603c430936a39c18c32aef4eb1be7c7a4f11610f0ccc18309cd4da1f2281969034f63a34b8cad99a23dd1d4e6dab8fcae0ba2e156cfc832e1d9cae808c79177e90fb8c4a3681ec66e82ec4ef8b14c12a1833f6c29638a43bed8d4b79cc2e069638f6463e38a345e971256ad07e2b1b1dd0d794d7d6412244036a0a', '_blank');"); 
				  driver.findElement(By.xpath("//*[@id=\"gopayment\"]")).click();
				  Set<String> Handles = driver.getWindowHandles();   
				  
				Iterator<String> it=Handles.iterator();
				  it.next();
				  String childid=(String) it.next();
				  driver.switchTo().window(childid);
		          //ArrayList<String> tabs = new ArrayList<>(windowHandles);
		         // Thread.sleep(3000);
		         // driver.switchTo().window(tabs.get(1)); */
		         
	@Test
				public void Take_Screenshot() throws IOException, InterruptedException {
		        //Takescreenshot
				   Thread.sleep(3000);
				   File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				   String path="C:\\Users\\Lenovo\\Pictures\\Screenshots\\RechargeDo.png";
				   File z = new File(path);
				   FileHandler.copy(x, z);
				   
				       System.out.println("SCREENSHOT CAPTURE SUCCESFULLY"); 
				       
				  
				}}
				     

			

		


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


