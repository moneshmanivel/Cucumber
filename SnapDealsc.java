package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealsc {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement ele= driver.findElement(By.id("inputValEnter"));
		ele.sendKeys("HP laptop");
		ele.sendKeys(Keys.ENTER);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Laks\\eclipse-workspace\\SeleniumNew\\Screenshot\\snap.png");
		FileUtils.copyFile(src, des);

	}

}
