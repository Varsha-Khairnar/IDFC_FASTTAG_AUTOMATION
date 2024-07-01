import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("hello IDFC");	
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
		Thread.sleep(1000);
		
//open page and enter mobile no.
	Thread.sleep(1000);
	
//Enter mobile no.
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input")).sendKeys("7028445287");
	
	//click on request OTP
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div")).click();
	
	//entre otp
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@placeholder='Enter OTP'])[1]")).click();//.sendKeys("294624");

	//click on Signin
Thread.sleep(14000);
	driver.findElement(By.xpath("(//div[contains(text(),'Sign In')])[1]")).click();
	Thread.sleep(5000);
	
	//click on continue
	driver.findElement(By.xpath("(//div[contains(text(),'Continue')])[1]")).click();
/*	//profile
	Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[1]/div[2]")).click();

//profile--pool acc details
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[2]/div")).click();
//fuel payment
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[3]/div")).click();
//tag details
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[4]/div")).click();

//My vehicle
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[5]/div")).click();

	
//Dispute
	Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Disputes')]")).click();*/

//Tranfer banner
	//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[1]/div[5]")).click();

//recharge banner
	Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[1]/div[4]")).click();
}
}