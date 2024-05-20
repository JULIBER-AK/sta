
import org.openqa.selenium.By;

import org.openqa.selenium. WebDriver; import org.openqa.selenium. WebElement;

import org.openqa.selenium.chrome.*;

import org.openqa.selenium.support.ui.*;

public class automationsele {

public static void main(String[] args)

{

System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver-win64\\chromedriver- win64\\chromedriver.exe\\");

WebDriver driver=new ChromeDriver();

driver.get("https://www.am azon.in");

WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));

SearchBox.sendKeys("IphoneX");

SearcbBox.Submit();

}

}