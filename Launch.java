public class Launch {
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "chromedriver-win64/.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.apple.com/in/");
			Thread.sleep(4000);
			Actions actions=new Actions(driver);
			actions.scrollByAmount(0,3000).perform();
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			Thread.sleep(6000);
			driver.findElement(By.name("sex")).click();			
			WebElement maleRadiobutton = driver.findElement(By.xpath("//input[@value = Male]");
		
		if (maleRadiobutton.isSelected()) {
			System.out.println("display male radio button is selected");
			
		}else
			
		{
			System.out.println("display female & custom radio buttons are unselected");
		}






	}

}
