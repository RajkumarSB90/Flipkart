package org.test;
import java.util.Date;
import java.util.List;

import org.base.Baseclass;
import org.createnew.POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart extends Baseclass{

	@BeforeClass
	private void Beforeclass() {
		BrowserLaunch("chrome");
		url("https://www.flipkart.com/");
		wait(10);
	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Date:"+ new Date());
		}
	@AfterMethod
	private void AfterMethod() {
		System.out.println("Date:"+ new Date());
		}
	@AfterClass
	private void AfterClass() {
	Driver.quit();
	}
	@Test
	private void login() {
		POM p =new POM();
		System.out.println("Git testing purpose");
p.getSearch().sendKeys("Iphone"+Keys.ENTER);
List<WebElement> elements = Driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
List<WebElement> price = Driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
for(WebElement result: elements) {
	System.out.println(result.getText());
}
for(WebElement result: price) {
	System.out.println(result.getText());
}
int[] array = new int[price.size()];
for(int i=0;i<price.size();i++) {
	String result=price.get(i).getText().replaceAll("[^0-9]", "");
	array[i]=Integer.parseInt(result);
}
int mini = Integer.MAX_VALUE,maxi=0;
for(int num:array) {
	if(num<mini)mini=num;
if(num>maxi)maxi=num;
}
System.out.println("Minmum Value is:"+mini);
System.out.println("Maximum Value is:"+maxi);
String text_result = p.getsearchresult().getText();
System.out.println(text_result);
int start = text_result.indexOf("f")+1;
int end = text_result.indexOf("results");
String substring = text_result.substring(start, end);
	System.out.println("Total search results"+substring);
	}
	}