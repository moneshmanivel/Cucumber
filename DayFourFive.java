package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourFive {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement element = driver.findElement(By.name("keyword"));
		element.sendKeys("iphone 15");
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//p[@class='product-title'])[1]")).click();
		
		
		
		
		
	}

}
