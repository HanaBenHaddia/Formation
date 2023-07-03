package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Creationcompte {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
	
	// creation du chrome driver
	WebDriver driver;
	driver= new ChromeDriver();
	//maximiser fenetre
	driver.manage().window().maximize();
	//supression cookies
	driver.manage().deleteAllCookies();
	 //ajouter cookies

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//ouvrir url
	driver.navigate().to("https://www.facebook.com");
	//driver.manage().addCookie();
	Thread.sleep(5000);
	
	//declaration des Webelements
	
	WebElement creercompte, prenom ,nomf, mail,confmail,mp,jour,mois,annee,genref,genrem,genrep,binscription;
	creercompte= driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	 Actions action = new Actions(driver) ;
      creercompte.click();

	prenom= driver.findElement(By.xpath("//input[@name='firstname']"));
	nomf= driver.findElement(By.xpath("//input[@name='lastname']"));
	
    mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	
	confmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	 prenom.sendKeys("Hana");
		nomf.sendKeys("Ben Haddia");
		mail.sendKeys("benhaddia.hana@gmail.com");
		
		
	action.keyDown(mail, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(confmail, Keys.CONTROL).perform();
	action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
    mp =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
    


	mp.sendKeys("Hana12345");
	
    
    jour=driver.findElement(By.xpath("//select[@title='Jour']"));
    Select select = new Select(jour);
    select.selectByValue("13");
    
    mois=driver.findElement(By.xpath("//select[@title='Mois']"));
    Select selectm = new Select(mois);
    selectm.selectByValue("9");
	
	annee=driver.findElement(By.xpath("//select[@title='Année']"));
	Select selecta = new Select(annee);
    selecta.selectByValue("1985");
	
	
	
	genref=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
	genref.click();
	
	//genrem=driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
	//genrem.click();
	
	
	
	binscription=driver.findElement(By.xpath("//button[@name='websubmit']"));
	
	binscription.click();
	
	}

}
