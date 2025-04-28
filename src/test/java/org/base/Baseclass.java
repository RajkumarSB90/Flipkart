package org.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver Driver;
public static WebDriver BrowserLaunch(String name){
	switch(name) {
		case "chrome": 
			Driver = new ChromeDriver();
			break;
		case "edge":
			Driver = new EdgeDriver();
			break;
		case "firefox":
			Driver = new FirefoxDriver();
			break;
		default:
			Driver = new InternetExplorerDriver();
			break;
	}
	return Driver;
		}
public static void url(String s)
{
Driver.get(s);
Driver.manage().window().maximize();
}
public static void sendkeys(WebElement e,String s) {
	e.sendKeys(s);
	
}
public static void btnclick(WebElement e) {
	e.click();
}
public static void quit(WebDriver e) {
	e.quit();
	}
public static void close(WebDriver e) {

	e.close();
}
public static void wait(int i) {
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
}
public static void genderradiobutton(WebElement e) {
		e.click();	
}
public static void select(WebElement e,String d) {
	Select s = new Select(e);
	s.selectByVisibleText(d);
}
public static void screenshot(String path) throws IOException {
	TakesScreenshot tk =(TakesScreenshot)Driver;
	File src =tk.getScreenshotAs(OutputType.FILE);
	File Des = new File(path);
	FileUtils.copyFile(src, Des);
	System.out.println(src);
}

public static String Readexcel(String N, String S, int r, int c) throws IOException {
	File f = new File("C:\\Users\\home-pc\\eclipse-workspace\\MavenandPomProject\\src\\test\\resources\\Datas.xlsx");
	FileInputStream st = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(st);
	Sheet s = w.getSheet(S);
	Row row = s.getRow(r);
	Cell cell = row.getCell(c);
	 CellType Type = cell.getCellType();
	 int typeAsInt = Type.ordinal();
	
	String value = null;
	if(typeAsInt==1) {
		value = cell.getStringCellValue();
	}				
				
	else {
		if(DateUtil.isCellDateFormatted(cell)) {
			Date datecellvalue = cell.getDateCellValue();
			SimpleDateFormat sd = new SimpleDateFormat("dd-mmm-yy");
			value = sd.format(datecellvalue);
		}
		else {
			double numbericcellvalue= cell.getNumericCellValue();
			long num = (long)numbericcellvalue;
			value = String.valueOf(num);
		}
	}
	return value;			
				
	}

	
	public static void Date( WebElement e, String s) {
		e.sendKeys(s);
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

