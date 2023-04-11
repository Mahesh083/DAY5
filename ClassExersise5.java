package WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExersise5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
//		FirefoxOptions fo=new FirefoxOptions();
//		driver = new FirefoxDriver(fo);
//
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		Set<String>s=driver.getWindowHandles();
		System.out.println("Total Number of browsers "+s.size());
//		Set<String>s1=driver.getTitle();
//		System.out.println("Total Number of browsers "+s1.size());
		
		
		
		
		
		
		
		

	}

}
