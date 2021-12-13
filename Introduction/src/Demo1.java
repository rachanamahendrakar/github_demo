import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
				//Create driver object for Firefox Browser
				
				//we will strictly implement methods of webdriver
				
				/* Classname = X
				 *  X driver = new driver();
				 */
				//invoke .exe file first
				
				System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://login.salesforce.com/");
				System.out.println(driver.getTitle());
				
				driver.findElement(By.cssSelector("#mydomainLink")).click();
				
				

	}

}
