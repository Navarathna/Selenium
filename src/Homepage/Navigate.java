package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.google.co.in//");
		 driver.findElement(By.linkText("Images")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(1000);
		 System.out.println("backword");
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 System.out.println("forward");
		 driver.navigate().refresh();
		 System.out.println("refresh");
		 
		 
	}

}
