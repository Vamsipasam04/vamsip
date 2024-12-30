package browser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "chromedriver-win64/.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("praveen.rekha96@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("nit@369");
		Thread.sleep(2400);
		driver.findElement(By.name("login")).click();
	    Thread.sleep(1000);
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("createAccountSubmit")).click();
	    Thread.sleep(2000);
	     driver.findElement(By.xpath(" WebElement YourName = driver.findElement(null)")).sendKeys("vamsi");
	    Thread.sleep(3000);
	    fn.sendKeys("vamsi");
	   Thread.sleep(1000);
	    fn.clear();
	    Thread.sleep(3000);
	    fn.sendKeys("nit");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ap_phone_number")).sendKeys("9866536428");
	    Thread.sleep(1000);
	    driver.findElement(By.name("password")).sendKeys("praveen@369");
	    Thread.sleep(800);
	    driver.findElement(By.className("a-button-input")).click();
		  driver.manage().window().minimize();
		Thread.sleep(600);
		driver.close();
		driver.getCurrentUrl();
	
		
	}

}
