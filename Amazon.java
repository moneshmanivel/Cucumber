package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//span[contains(text(),'Air')]")).click();
}
}
