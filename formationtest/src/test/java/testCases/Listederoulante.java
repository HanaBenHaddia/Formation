package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listederoulante {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
		//creation du chrome driver
				
				WebDriver driver;
		      driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//temps de chargement implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//ouverture de l'url
		
		driver.navigate().to("https://demoqa.com/select-menu");
		    //Thread.sleep(5000);
		
		
		// declaration et identification des element
		
		WebElement couleur;
		couleur = driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(couleur);
            select.selectByValue("5");
            driver.close();
	}

}
