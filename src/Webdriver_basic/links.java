package Webdriver_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com//");
		 //driver.findElement(By.linkText("Data Policy")).click();
		 //driver.findElement(By.partialLinkText("Data")).click();
		 //driver.close();
		 //driver.quit();
		 driver.findElement(By.xpath("//input[0id='email']")).sendKeys("welcome");
	}

}
