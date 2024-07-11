package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingNew {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Lak");
		driver.findElement(By.id("pass")).sendKeys("lak123");
		
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("firstname")).sendKeys("Butter");
	driver.findElement(By.name("lastname")).sendKeys("butterkaradi");
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByIndex(14);
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select s1=new Select(month);
	s1.selectByValue("11");
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("1994");
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	

	}

}
