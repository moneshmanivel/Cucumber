package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFour {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		WebElement ele = driver.findElement(By.xpath("(//u[contains(text(),Greens)])[1]"));
		String text = ele.getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
