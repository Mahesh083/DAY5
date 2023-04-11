package WebElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exersise3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();                
		WebDriver driver;                                     
		ChromeOptions co = new ChromeOptions();               
		co.addArguments("--remote-allow-origins=*");          
		driver = new ChromeDriver(co);                        
		driver.get("https://demo.guru99.com/test/delete_customer.php"); 
		WebElement cid=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	    cid.sendKeys("401");
		
		WebElement submit=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		submit.click();
		Alert alert=driver.switchTo().alert();
//		Thread.sleep(3000);
		alert.dismiss();
		cid.clear();
		
		cid.sendKeys("402");
		submit.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		Alert alert3=driver.switchTo().alert();
		String message=alert3.getText();
		alert3.accept();
		System.out.println(message);
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	

	}

}
