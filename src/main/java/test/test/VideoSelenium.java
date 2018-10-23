package test.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VideoSelenium {

	public static void main( String[] args ) throws InterruptedException {
		
		System.out.println( "my name is vikash");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.spicejet.com");
	
	
	Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	
	
	
	s.selectByVisibleText("USD");
	
	Thread.sleep(2000);
	
	s.selectByIndex(1);
	
	Thread.sleep(2000);
	
	s.selectByValue("AED");
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	
	Thread.sleep(1000);
	
	
	/*Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
	
	
	
	Thread.sleep(1000);
	
	s1.selectByValue("BLR");
	
    Thread.sleep(2000);
	
	Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
	
	s2.selectByValue("MAA");*/
	
	
	driver.findElement(By.xpath("//a[contains(text(),'Bengaluru')]")).click();
	
	Thread.sleep(1000);
	
	driver.findElements(By.xpath("//a[contains(text(),'Delhi')]")).get(1).click();
	
	}	
}
