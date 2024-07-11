package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourSeven {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("Oneplus 7t");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//h2[contains(text(),Oneplus)])[1]")).click();
		

	}

}
