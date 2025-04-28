package org.createnew;
import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Baseclass{
	
	public POM() {
		PageFactory.initElements(Driver, this);	
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
			}
	
	@FindBy(xpath="//div[@class='KzDlHZ']")
	private WebElement searchbox;
	public WebElement getSearchbox() {
return searchbox;		
	}
	@FindBy(xpath="//div[@class='Nx9bqj _4b5DiR']")
	private WebElement price;
	public WebElement getprice() {
return price;		
	}

@FindBy(xpath="//span[contains(text(),'results for')]")
private WebElement searchresult;
public WebElement getsearchresult() {
	return searchresult;
}

	
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginbtn;

	
	
	
public WebElement getUsername() {
		return username;
	}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
	
@FindBy(xpath="//a[text()='Create new account']")
private WebElement createbtn;
public WebElement getcreatebtn(){
	return createbtn;
}
@FindBy(name="firstname")
private WebElement firstname;
public WebElement getFirstname() {
	return firstname;
}

@FindBy(name="lastname")
private WebElement lastname;
public WebElement getlastname() {
	return lastname;
}

@FindBy(name="birthday_day")
private WebElement date;
public WebElement getbirthdate() {
	return date;
}
@FindBy(id="month")
private WebElement month;
public WebElement getbirthmonth() {
	return month;
}
	
@FindBy(id="year")
private WebElement year;
public WebElement getbirthyear() {
	return year;
}
@FindBy(xpath="(//input[@type='radio'])[2]")
private WebElement gender;
public WebElement getgender(){
	return gender;
}
@FindBy(xpath="(//input[@type='text'])[5]")
private WebElement mobilenumber;
public WebElement getmobilenumber(){
return mobilenumber;
}
@FindBy(xpath="//input[@type='password']")
private WebElement cfnpass;
public WebElement getpassword() {
return cfnpass;
}
@FindBy(xpath="//button[@type='submit']")
private WebElement buttonclick;
public WebElement getbuttonclick(){
	return buttonclick;
}

}