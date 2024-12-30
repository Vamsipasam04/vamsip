package Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdown {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "chromedriver-win64/.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/r.php?entry_point=login");
				
				WebElement dateofBirth = driver.findElement(By.name("birthday_day"));
				Select dateofBirthdropdown = new Select(dateofBirth);
				dateofBirthdropdown.selectByIndex(3);
				WebElement courseName = driver.findElement(By.name("computerScience"));
				WebElement monthName = driver.findElement(By.name("birthday_month"));
				Select monthNamedropdown = new Select(monthName);
				monthNamedropdown.selectByIndex(6);
				Thread.sleep(2000);
				WebElement birthdayYear = driver.findElement(By.name("birthday_year"));
				Select birthdayYeardropdown = new Select(birthdayYear);
				birthdayYeardropdown.selectByIndex(19);
				Thread.sleep(1000);
	}
