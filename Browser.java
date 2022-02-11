import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Android\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     driver.findElement(By.name("password")).sendKeys("secret_sauce");
     driver.findElement(By.id("login-button")).click();
     
   
	//driver.close();  //for closing that particular tab.
    // driver.quit();  //for closing entire application here chrome.
	
	}
	}


