package respositorio;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class entrar extends base {
	
	//Declaracion de variables
		 private WebDriver driver;
		 private base objBase = new base();
		 private String baseUrl="http:\\www.google.es";
		
		 @BeforeSuite
		  public void beforeTest() {
						
				driver = objBase.getDriverC();
				
		  }
		  
	  @Test
	  public void acceder() {
		  driver.get(baseUrl);
	  }
	  
	  @Test
	  public void cerrar() {
		  driver.quit();
	  }
}
