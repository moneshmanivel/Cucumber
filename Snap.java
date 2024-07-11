package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
    driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),login)])[23]")).click();
    
}

}
