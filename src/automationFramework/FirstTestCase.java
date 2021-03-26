package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GUSTINA\\Downloads\\Software Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bukalapak.com/");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		driver.findElement(By.className("te-header-login")).click();
		
		 
		//Locating web element
		 WebElement uName = driver.findElement(By.xpath("//*[@data-testid='username']"));
		 WebElement pswd = driver.findElement(By.xpath("//*[@data-testid='password']"));
		 WebElement loginBtn = driver.findElement(By.xpath("//*[@data-testid='submit-button']"));
		 
		//Peforming actions on web elements
		 uName.sendKeys("query13test@gmail.com");
		 pswd.sendKeys("query1316ms");
		 loginBtn.click();
		 
		 //Putting implicit wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 try {
			 
			 //Locating web element
			 WebElement profilBtn = driver.findElement(By.xpath("//*[@data-testid='profile-url']"));
			 //Validating presence of element 
			 if(profilBtn.isDisplayed()){
			 
				 //Performing action on web element
				 profilBtn.click();
				 System.out.println("Test Successful!");
			 }
		 } 
		 catch (Exception e) {
			 System.out.println("Test Failure....");
		 }
		 
		 //Closing browser session
		 driver.quit();
		
	}

}
