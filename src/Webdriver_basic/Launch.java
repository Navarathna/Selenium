package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginUser("nav@gmail.com","pass");
		
	}
	
	public static void loginUser(String email ,String pass) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com//");
		 WebElement Unm=driver.findElement(By.id("email"));
		 Unm.sendKeys(email);
		 driver.findElement(By.name(pass)).sendKeys("test");
		 driver.findElement(By.id("loginbutton")).click();
	}
}
