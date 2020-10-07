package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrivers.AppDrivers;

public class NewServiceTicket extends AppDrivers
{

	public NewServiceTicket()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (id = "txtSubject") WebElement subject;
	
	@FindBy (id = "txtDescription") WebElement description;
	
	@FindBy (id = "Customer_ID") WebElement company;
	
	@FindBy (id = "User_ID") WebElement assignedadmin;
	
	@FindBy (id = "txtLocation") WebElement location;
	
	@FindBy (id = "txtScheduleDateTime_dateInput_text") WebElement scheduledate;
	
	@FindBy (id = "txtScheduleTime") WebElement scheduletime;
	
	@FindBy (id = "txtEndDateTime_dateInput_text") WebElement enddate;
	
	@FindBy (id = "txtEndTime") WebElement endtime;
	
	@FindBy (id = "chkEndDate") WebElement enddatecheckbox;
	
	@FindBy (id = "chkRecurrence") WebElement recurringcheckbox;
	
	@FindBy (id = "btnSave") WebElement savebutton;
	
	@FindBy (id = "btnCancel") WebElement cancelbutton;
	
	@FindBy (id = "btnDelete") WebElement deletebutton;
	
	
}
