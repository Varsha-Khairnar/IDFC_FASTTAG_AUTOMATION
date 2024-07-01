import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Quik_links_idfc {


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setting up WebDriver
        System.setProperty("webdriver.chrome.driver", "F:\\DGSL Automation Training\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test(priority = 1)
    public void testLoginAndNavigate() throws InterruptedException {
        // Navigate to the URL
        driver.get("https://dev.ffetoll.idfcfirstbank.com/Login");
        Thread.sleep(1000);

        // Enter mobile number and request OTP
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input"))
                .sendKeys("7028445287");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div"))
                .click();
        Thread.sleep(1000);

        // Enter OTP and sign in
        driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]")).click();
        // .sendKeys("294624"); // Uncomment and add OTP if needed
        Thread.sleep(14000);
        driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
        Thread.sleep(5000);

        // Click on Continue
        driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void testProfileActions() throws InterruptedException, IOException {
        // Click on profile and perform actions
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[1]/div[2]")).click();
    
      //Takescreenshot
		   Thread.sleep(3000);
		   File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   String path="C:\\Users\\Lenovo\\Pictures\\profil.png";
		   File z = new File(path);
		   FileHandler.copy(x, z);
		   
		       System.out.println("SCREENSHOT CAPTURE SUCCESFULLY"); 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[2]/div")).click(); 
        
        //profile--pool acc details
     
      
		 //fuel payment
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[3]/div")).click();
        
      
		   
		   //tag details
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[4]/div")).click();
        
      
		   //My vehicle
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[5]/div")).click();
  
      
		   
    }
  
   
    }
