package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import net.bytebuddy.asm.Advice.Argument;

public class Classexersise4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();                
		WebDriver driver;                                     
		ChromeOptions co = new ChromeOptions();               
		co.addArguments("--remote-allow-origins=*");          
		driver = new ChromeDriver(co);                        
		driver.get("https://abhibus.com/bus-ticket-booking");
		WebElement leaving=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		leaving.sendKeys("THURAIYUR",Keys.ENTER);
		WebElement going=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		going.sendKeys("COIMBATORE",Keys.ENTER);
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		date.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','14-12-2003')",date);
		
		
		
		

	}

}
