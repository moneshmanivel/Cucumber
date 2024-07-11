package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayThree {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("monesh");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("S");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("mylapore");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("monesh@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("msdd")).sendKeys("English");
		
		WebElement txt = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select s = new Select(txt);
		s.selectByValue("Adobe Photoshop");
		WebElement country = driver.findElement(By.id("countries"));
		Select s1=new Select(country);
		s1.deselectByValue("India");
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s2=new Select(year);
		s2.selectByValue("1995");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select s3=new Select(month);
		s3.selectByValue("February");
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s4=new Select(day);
		s4.selectByValue("3");
		driver.findElement(By.id("firstpassword")).sendKeys("1234");
		driver.findElement(By.id("secondpassword")).sendKeys("1234");
		driver.findElement(By.id("submitbtn")).click();

	}

}
