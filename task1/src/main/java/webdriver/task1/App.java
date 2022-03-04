package webdriver.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", 
		"D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}
	public void navigate() throws InterruptedException
	{
		driver.navigate().to("https://www.flipkart.com/");
		
		
	}
	public void opengmail() throws InterruptedException
	{
	
         driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("pradipmaane@gmail.com");
		
	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Pradip@5656");
		
	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
	

	
	public static void main(String[] args) throws InterruptedException 
	{
		App ob = new App();
		ob.launchBrowser();
		ob.navigate();
		ob.opengmail();
		
	}
}

/*
public void navigate() throws InterruptedException
{
	driver.navigate().to("https://www.google.co.in");
	driver.navigate().to("https://www.gmail.com/");
	
}
*/
/*
public void opengmail() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("gcreddy");

	Thread.sleep(2000);
	
	driver.findElement(By.name("password")).sendKeys("Temp@2020");
     Thread.sleep(2000);
	driver.findElement(By.id("tdb1")).click();
	System.out.println("URL:- " +driver.getCurrentUrl());
	  Thread.sleep(4000);
	driver.close();
}
*/
/*
public void navigate() throws InterruptedException
{
	driver.navigate().to("https://en.wikipedia.org/wiki/Selenium");
	System.out.println("This is the title of the website"+driver.getTitle());
	Thread.sleep(2000);
	driver.findElement(By.id("pt-createaccount")).click();
	Thread.sleep(3000);
	System.out.println("URL:- " +driver.getCurrentUrl());
	driver.navigate().back();
	driver.navigate().to("https://www.selenium.dev/downloads/");
	System.out.println("URL:- " +driver.getCurrentUrl());
	
}
*/
