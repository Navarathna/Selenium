package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com//");
		 String title=driver.getTitle();
		 System.out.println("enter a title:"+title);
		 System.out.println(driver.getCurrentUrl());
		 WebElement Unm=driver.findElement(By.id("email"));
		 System.out.println(Unm.getAttribute("id"));
		 System.out.println(Unm.getTagName());
		 
	}

}
