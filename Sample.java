package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("//h2[contains(text(),'Model')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Resume Model')]")).click();
	
	
}
	
	
	
	
	
	
}
