package TestNGPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2
{
   @Test
   public void openApp(){
      WebDriver driver = new FirefoxDriver();
      driver.get("http://newtours.demoaut.com");
   }
   
}
