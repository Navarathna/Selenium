package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.javatpoint.com//");
		 String Title=driver.getTitle();
		 System.out.println("title:"+Title);
		 WebElement Unm= driver.findElement(By.name("search"));
		 Unm.sendKeys("java tutorial");
		

	}

}
