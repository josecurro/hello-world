import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {

	
	public WebDriver getDriverC() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/driver/chromedriver/chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver navegador = new ChromeDriver(options);
		return navegador;
	}
	
}
