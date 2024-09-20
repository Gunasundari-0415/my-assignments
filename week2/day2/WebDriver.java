package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("loginbutton")).click();
	driver.findElement(By.linkText("find your account and login.")).click();
	
	
	
		
		
		
				

	}

}
