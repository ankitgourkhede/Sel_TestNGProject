package TestNGpkg;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.*;

public class FirstTestNGFile {
  @Test
  public void f() {
	  WebDriver driver;
	  try {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().deleteAllCookies();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			 driver.get("http://www.facebook.com");
			 driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
			 driver.findElement(By.name("pass")).sendKeys("1234");
			 driver.findElement(By.id("loginbutton")).click();
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			 
			 
			 driver.get("http://www.amazon.in");
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Shoes");
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstTestNGFile myobj=new FirstTestNGFile();
		myobj.f();
						
	}
  }

