package test.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Test;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();

		// Open Ixigo
		driver.get("http://www.ixigo.com");
		
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.linkText("TRAINS")).click(); 
		
		
		
		driver.findElement(By.xpath("//a[@href='/hotels']")).click();
		
	
		
		driver.findElement(By.cssSelector("a[href='/offers']")).click();
		
		driver.navigate().back(); 
		
		driver.findElement(By.cssSelector("a[href='/flights']")).click();*/
		
		
		driver.findElements(By.xpath("//div[@class='clear-input ixi-icon-cross']")).get(0).click();
		
		
		driver.findElement(By.xpath("//div[text()='From']/following-sibling::input[@placeholder='Enter city or airport']")).sendKeys("BLR");
		
		driver.findElement(By.xpath("//div[text()='From']/following-sibling::input[@placeholder='Enter city or airport']")).click();
		
		Thread.sleep(2000);
		
		driver.findElements(By.xpath("//div[contains(text(),'BLR')]")).get(0).click();
		
		
		
		driver.findElement(By.xpath("//div[text()='To']/following-sibling::input[@placeholder='Enter city or airport']")).click();
		
		driver.findElement(By.xpath("//div[text()='To']/following-sibling::input[@placeholder='Enter city or airport']")).clear();
		
		driver.findElement(By.xpath("//div[text()='To']/following-sibling::input[@placeholder='Enter city or airport']")).sendKeys("BOM");
		
		driver.findElement(By.xpath("//div[text()='To']/following-sibling::input[@placeholder='Enter city or airport']")).click();
		
		Thread.sleep(2000);
	
		driver.findElements(By.xpath("//div[contains(text(),'BOM')]")).get(0).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@data-date='25102018']/div[@class='day has-info']")).click();
		
		driver.findElement(By.xpath("//div[text()='Adult']/../following-sibling::div/span[@data-val='3']")).click();
		
		driver.findElement(By.xpath("//div[text()='Child']/../following-sibling::div/span[@data-val='2']")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//span[@class='user-login ixi-icon-user']")).click();
		driver.findElement(By.name("email")).sendKeys("vikash28885@gmail.com");
		driver.findElement(By.name("password")).sendKeys("0407740056");
		driver.findElement(By.xpath("//Span[text()='SIGN UP']")).click();
		driver.findElement(By.xpath("//i[@class='ixi-icon-caret u-ib c-dropdown-caret dd-icon ']")).click();
		driver.findElement(By.xpath("//li[@data-index='1']/span[text()='Mstr']")).click();
		driver.findElement(By.name("firstName")).sendKeys("vikash");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email ID']")).sendKeys("vikash28885@gmail.com");
		driver.findElement(By.xpath("//i[@class='ixi-icon-caret dd-icon']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Togo')]")).click();
	
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("98123456789");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("0407740056");
		driver.findElement(By.xpath("//span[@class='u-ripple-circle']/../../../button[text()='Register']")).click();*/
	
		
		
		
				// Closing the browser
		
		//test comment
				
				
		//driver.close();
	}

}

