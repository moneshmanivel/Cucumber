package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TrainApp {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	driver.findElement(By.id("from_station")).sendKeys("Chennai");
	driver.findElement(By.id("to_station")).sendKeys("Delhi");
	WebElement cls = driver.findElement(By.id("trainClass"));
	Select s=new Select(cls);
	s.selectByValue("1A");
	driver.findElement(By.id("dpt_date")).sendKeys("12/08/2024");
	WebElement mem = driver.findElement(By.id("train_adults"));
	mem.click();
	Select s2=new Select(mem);
	s2.selectByValue("1");
	driver.findElement(By.id("trainFormButton")).click();
	
	
}
}
