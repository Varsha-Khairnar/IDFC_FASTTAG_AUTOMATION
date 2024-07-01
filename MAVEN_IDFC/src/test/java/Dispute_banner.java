import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dispute_banner {
	
	/*WebDriver driver;

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
    @Test
    public void Dispute_Banner() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[contains(text(),'Disputes')]")).click();
    }*/
	
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
    public void testDisputeBanner() throws InterruptedException {
        // Example test method for clicking on Disputes banner
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Disputes')]")).click();
    }
   
   
    }



