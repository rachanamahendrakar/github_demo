import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		//Create driver object for chrome Browser
		
		//we will strictly implement methods of webdriver
		
		/* Classname = X
		 *  X driver = new driver();
		 */
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");//hit url on the browser
		System.out.println(driver.getTitle());//validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); //validate you are landed on current url
		System.out.println(driver.getPageSource()); //print page source
		
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		//driver.navigate().forward();
		
		driver.close();//close the browser
		//driver.quit();//it close the all the browser opened by selenium script
	}

}
