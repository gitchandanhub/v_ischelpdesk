package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseDrivers.AppDrivers;

public class DashboardPage extends AppDrivers
{
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "ctl00_mnuDashbord") WebElement dashboardtab;
	
	@FindBy (id = "ctl00_mnuScheduling") WebElement schedulingtab;

	@FindBy (id = "ctl00_mnuTickets") WebElement ticketstab;

	@FindBy (id = "ctl00_mnuBilling") WebElement billingtab;

	@FindBy (id = "ctl00_mnuWorkstations") WebElement devicestab;

	@FindBy (id = "ctl00_mnuPassword") WebElement passwordstab;

	@FindBy (id = "ctl00_mnupurchase") WebElement purchasestab;

	@FindBy (id = "ctl00_mnuContacts") WebElement contactstab;
	
	@FindBy (id = "ctl00_mnuReports") WebElement reportstab;
	
	@FindBy (id = "ctl00_mnuSystems") WebElement systemtab;
	
	@FindBy (id = "ctl00_cmbCompany_Input") WebElement companieslist;
	
	@FindBy (id = "ctl00_MainContent_cmbworkstation") WebElement deviceslist;
	
	@FindBy (id = "ctl00_MainContent_Date_Time1_dateInput_text") WebElement date;
	
	
	@FindBy (id = "ctl00_MainContent_btngo") WebElement gobutton;
	
	public void clickOnDashboard()
	{
		dashboardtab.click();
	}
	public void clickOnScheduling()
	{
		schedulingtab.click();
	}
	public void clickOnTickets()
	{
		ticketstab.click();
	}
	public void clickOnBilling()
	{
		billingtab.click();
	}
	public void clickOnDevices()
	{
		devicestab.click();
	}
	public void clickOnPasswords()
	{
		passwordstab.click();
	}
	public void clickOnPurchases()
	{
		purchasestab.click();
	}
	public void clickOnContacts()
	{
		contactstab.click();
	}
	public void clickOnReports()
	{
		reportstab.click();
	}
	
	public void clickOnSystem()
	{
		systemtab.click();
	}
	
	public void selectDevice(String device)
	{
		Select s = new Select(deviceslist);
		s.selectByVisibleText(device);
	}
	public void selectDate(String dt)
	{
		date.sendKeys(dt);
	}
	
	public void clickOnGo()
	{
		gobutton.click();
	}

}
