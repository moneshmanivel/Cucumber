package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourThree {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement txt = driver.findElement(By.id("APjFqb"));
		txt.sendKeys("greens velmurugan");
		txt.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='OSrXXb'])[1]")).click();
		
		
		
		

	}

}
