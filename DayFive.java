package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFive {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		WebElement ele= driver.findElement(By.xpath("//div[@class='heading__articles']"));
	    JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	    String text = ele.getText();
		System.out.println(text);
		
		
		
		

	}

}
