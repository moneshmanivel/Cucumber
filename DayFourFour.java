package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourFour {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("monesh");
		String uservalue = username.getAttribute("value");
		System.out.println("Value Entered in Username is "+uservalue);
		WebElement passtxt = driver.findElement(By.id("password"));
		passtxt.sendKeys("testing");
		String passvalue = passtxt.getAttribute("value");
		System.out.println("Value Entered in Password is "+passvalue);
		
		
		
		
		
	}

}
