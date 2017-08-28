import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class acceder extends base {
	
	public static WebDriver wdF,wdC,wdIE;
	public base b = new base();
	public String url = ("Http://www.google.es");
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	 wdC = b.getDriverC();
	 wdC.manage().window().maximize();
	 wdC.get(url); 
	  
	 
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	Thread.sleep(3000);
	wdC.quit();
  }

}
