package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
		//creation du chrome driver
				
				WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		//declaration et identification 

		WebElement rightclick ;
		rightclick = driver.findElement(By.id("rightClickBtn"));
		
    //action right click
		
		Actions  action = new Actions (driver);
		action.contextClick(rightclick).perform();
		
		
		//verification
		
		WebElement message;
	
		message = driver.findElement(By.id("rightClickMessage"));
		String texte ;
		
		texte = message.getText();
		
		Assert.assertEquals(texte,"You have done a right click");
		
		System.out.println("rightclick done");
		

		driver.close();


	}

}
