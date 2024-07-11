package org.demo;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertSix {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.contextClick().perform();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}
}
