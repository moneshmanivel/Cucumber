package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFive {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://canarabank.com/net-banking#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@style='text-align:right']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		WebElement pop = driver.findElement(By.xpath("//div[@class='close-btn']"));
            //String text = a.getText();
            //System.out.println(text);
           a.accept();
           
		
		
	}

}
