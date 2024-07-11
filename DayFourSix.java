package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourSix {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		text.sendKeys("monesh");
		String value = text.getAttribute("value");
		System.out.println("Value Entered in Username is "+value);
		
		
		
		
		
	}

}
