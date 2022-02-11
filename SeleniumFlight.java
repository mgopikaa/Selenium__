import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFlight {
	
public static void main(String[] args) throws InterruptedException
	
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Android\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.booking.com/");
	driver.manage().window().maximize();
	
	
		driver.findElement(By.xpath("//span[normalize-space()='Flights']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Round-trip')]")).click();
		driver.findElement(By.cssSelector(".css-1k0jlfl")).click();
		WebElement staticdropdown = driver.findElement(By.cssSelector(".css-1k0jlfl"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.xpath("(//div[contains(text(),'1 adult')])[1]")).click();
		driver.findElement(By.cssSelector(".css-153jucu")).click();
		driver.findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
        driver.findElement(By.cssSelector(".css-ya5gr9")).click();
	
	/*	System.setProperty("webdriver.chrome.driver","C:\\Android\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		driver.findElement(By.cssSelector(".bui-tab__link")).click();
		driver.findElement(By.cssSelector(".css-1k0jlfl")).click();
		WebElement staticdropdown = driver.findElement(By.cssSelector(".css-1k0jlfl"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//driver.findElement(By.cssSelector(".css-1k0jlfl")).click();
		//Select dropdown1=new Select(driver.findElement(By.className("css-1k0jlfl")));
		//	dropdown1.selectByValue("Business");
					driver.findElement(By.cssSelector("div[class='css-vvcyi3'] div div div")).click();
				driver.findElement(By.xpath("(//button[@class='css-153jucu'])[1]")).click();
				driver.findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
				driver.findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
				
				
				Select age=new Select(driver.findElement(By.cssSelector(".InputSelect-module_field__10sp5")));
				age.selectByValue("4");
				Select age1=new Select(driver.findElement(By.xpath("//select[@id=__bui-7']")));
				age.selectByValue("2");
				driver.findElement(By.cssSelector("button[class='çss-ya5g'r9']")).click();
			  
			 */
			  
			  
			  
			  
			  driver.findElement(By.cssSelector(".css-p6nr6s")).click();
			  driver.findElement(By.cssSelector(".css-1eii3rq")).click();
			  driver.findElement(By.cssSelector("input[placeholder='where from'?']")).sendKeys("Trivandrum");
			  List<WebElement> from=driver.findElements(By.cssSelector(".css-11bbywx"));
			  for (WebElement fr :from) {
				  if(fr.getText().equalsIgnoreCase("TRV)"));
				  {
					  fr.click();
				  }
			  }
			  
			  
			  
			  driver.findElement(By.cssSelector(".css-l20al1t")).click();
			  driver.findElement(By.cssSelector(".css-1eii3rq")).click();
			  driver.findElement(By.xpath("//input[@placeholder=")).sendKeys("Delhi");
			  List<WebElement> fromm =driver.findElements(By.cssSelector(".css-11bbywx"));
			  for (WebElement t :fromm) {
				  if(t.getText().equalsIgnoreCase("DEL)"));
				  {
					  t.click();
				  }
			  }
			  
			driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();
			driver.findElement(By.cssSelector("span[data-date-cell='2022-02-10']")).click();
			driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
	        driver.findElement(By.cssSelector("span[data-date-cell='2022-02-16']")).click();
			driver.findElement(By.cssSelector(".css-ya5gr9.wide")).click();
				
			driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
			driver.close();
			
		}}




