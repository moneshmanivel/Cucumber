package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSeven {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("qwe");
		driver.findElement(By.xpath("//a[contains(text(),'CON')]")).click();
		Alert a = driver.switchTo().alert();

		a.accept();
		
	}

}
