package respositorio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver getDriverF() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Automatizacion\\driver\\firefox\\geckodriver.exe");
		WebDriver driver;
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile testprofile = profile.getProfile("default");
		testprofile.setAcceptUntrustedCertificates(true);
		testprofile.setAssumeUntrustedCertificateIssuer(true);
		driver = new FirefoxDriver(testprofile);
		return driver;
		//return null;
	}
	
	
	public WebDriver getDriverC() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/GreenData/driver/chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver dc = new ChromeDriver(options);
		
		return dc;
		//return null;
	}
	
	public WebDriver getDriverIE() {
		
		System.setProperty("webdriver.ie.driver", "C:\\Automatizacion\\driver\\iexplorer\\IEDriverServer.exe");
		WebDriver diex = new InternetExplorerDriver();
		
		return diex;
		//return null;
	}
	
	
	public String dameWeb()
	{
		 String clave ="http://www.google.es";
		 return clave;
	}
	
	
}
