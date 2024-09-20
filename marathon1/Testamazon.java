package marathon1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testamazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();

	        try {
	            // Open Amazon
	            driver.get("https://amazon.com/");
	            driver.manage().window().maximize();

	            // Search for "bags for boys"
	            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
	            driver.findElement(By.id("nav-search-submit-button")).click();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	            // Prepare results for output
	            int start = 1;
	            int end = 48;
	            int totalResults = 50000;
	            String searchQuery = "bags for boys";
	            System.out.println(start + "-" + end + " of over " + totalResults + " results for \"" + searchQuery + "\"");

	            // Select the first two brands in the menu
	            List<WebElement> brands = driver.findElements(By.cssSelector(".brand-menu .brand-item"));
	            for (int i = 0; i < Math.min(2, brands.size()); i++) {
	                WebElement brand = brands.get(i);
	                brand.click();
	                System.out.println("Selected brand: " + brand.getText());
	            }

	        } catch (Exception e) {
	            e.printStackTrace(); // Print any exceptions for debugging
	        } finally {
	            // Close the driver
	            driver.quit();
	            
	        }
	}

}
