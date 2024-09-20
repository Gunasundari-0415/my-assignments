package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaunchBrowser {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftabs.com/opentabs/.");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
WebElement companyName=driver.findElement(By.xpath("//select[@id='create lead"));
companyName.sendKeys("Testleaf");
WebElement firstName=driver.findElement(By.xpath("//select[@id='create lead"));
firstName.sendKeys("Gunasundari");
WebElement lastName=driver.findElement(By.xpath("//select[@id='create lead"));
lastName.sendKeys("Bharath");
WebElement dd1=driver.findElement(By.xpath("//select[@id='create lead"));
Select dropdown1 = new Select(dd1);
dropdown1.selectByIndex(4);
WebElement dd2=driver.findElement(By.xpath("//select[@id='create lead"));
Select dropdown2 = new Select(dd2);
dropdown2.selectByVisibleText("Autumobile");

WebElement dd3=driver.findElement(By.xpath("//select[@id='create lead"));
Select dropdown3= new Select(dd3);
dropdown3.selectByValue("OWNER_CCOP");
driver.findElement(By.xpath("//input[@name='Submitbutton']")).click();


		
	}
}
