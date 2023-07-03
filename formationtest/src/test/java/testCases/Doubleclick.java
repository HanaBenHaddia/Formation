package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		//
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
		//creation du chrome driver
				
				WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		//action doubleclick

		WebElement Doublebtn ;
		Doublebtn = driver.findElement(By.id("doubleClickBtn"));
		Actions  action = new Actions (driver);
		action.doubleClick(Doublebtn).perform();
		
		WebElement message;
		
		message = driver.findElement(By.id("doubleClickBtn"));
		
		String texte ;
	
		texte = message.getText();
		
		Assert.assertEquals(texte,"You have done a double click");
		
		System.out.println("double click done");
		driver.close();

		
		
		
		
		
		
	}

}
