package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {
  @Test
  public void testGoogleSearch() throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Louise\\Pictures\\Skola\\chromedriver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver(); //starta chrome
    driver.get("http://www.google.com/"); //navigera till google.com
    Thread.sleep(5000);                   //vänta i 5 sekunder
    WebElement searchBox = driver.findElement(By.name("q")); //hitta sökfältet
    searchBox.sendKeys("ChromeDriver"); //skriva in chromedriver i sökfältet
    searchBox.submit(); //skicka data som finns i sökfältet 
    Thread.sleep(5000);  //vänta i 5 sekunder
    driver.quit(); //stänga ner chrome
  }
}
