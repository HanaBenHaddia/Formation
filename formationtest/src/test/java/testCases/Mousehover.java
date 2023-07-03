package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		//chemin du chrome driver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				
				//creation du chrome driver
						
						WebDriver driver;
				driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				
				//ouverture de l'url
				
				driver.navigate().to("https://demoqa.com/menu");
				Thread.sleep(5000);
				
				WebElement  mousehover;
				WebElement subsublist;
				
				mousehover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
				subsublist= driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
				
				
				
				Actions  action = new Actions (driver);
				action.moveToElement(mousehover).perform();
				action.moveToElement(subsublist).perform();
				
				
				
				
				
				System.out.println("test ok ");
				driver.close();
				

	}

}
