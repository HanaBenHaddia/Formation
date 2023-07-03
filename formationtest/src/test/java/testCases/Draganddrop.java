package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		//chemin du chrome driver
		
System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
		//creation du chrome driver
				
				WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//ouverture de l'url
		
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(5000);
		
		WebElement dragme;
		WebElement drophere;
		
		dragme = driver.findElement(By.id("draggable"));
		
		drophere = 	driver.findElement(By.id("droppable"));	
		
		Actions  action = new Actions (driver);
		action.dragAndDrop(dragme, drophere).perform();
		
		
		// verification
		
		String texte;
		texte = drophere.getText();
		Assert.assertEquals(texte,"Dropped!");
		System.out.println("drop is ok ");
		driver.close();
		
		
	}}
