package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourTwo {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement fb = driver.findElement(By.xpath("//h2[contains(text(),Facebook)]"));
	String text = fb.getText();
	System.out.println(text);
	WebElement emailtxt = driver.findElement(By.id("email"));
	emailtxt.sendKeys("monesh");
	String value = emailtxt.getAttribute("value");
	System.out.println("Text passed in Email field is "+value);
	WebElement passtxt = driver.findElement(By.id("pass"));
	passtxt.sendKeys("selenium");
	String passvalue = passtxt.getAttribute("value");
	System.out.println("Text passed in Password field is "+passvalue);
	
	
	
}
}
