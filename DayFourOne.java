package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourOne {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement ele1= driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		String text = ele1.getText();
		System.err.println(text);
		
		
		
		
		
		
	}
}
