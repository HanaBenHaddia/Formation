package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		//identification (chemin)chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
	
//
		WebDriver driver;
driver = new ChromeDriver();
//maximize ecran
driver.manage().window().maximize();
//delet cookies
driver.manage().deleteAllCookies();
// ouvrir url
 //driver.get("https://www.google.fr/");
 
 driver.navigate().to("https://www.google.fr/");
 
 //close chrome
 driver.close();
}
	}
