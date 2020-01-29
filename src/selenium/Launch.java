package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swetha\\eclipse-workspace\\Selenium Day 1\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
