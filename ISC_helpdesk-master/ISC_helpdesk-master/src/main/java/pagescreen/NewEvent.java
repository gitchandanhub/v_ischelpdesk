package pagescreen;

import Base.BaseDriver;
import Base.Library;

public class NewEvent extends BaseDriver
{
	Library library;
	public NewEvent()
	{
		super();
		library = new Library();
	}
	
	public void enterSubject(String sub)
	{	
		//library.clearTextbox(object.getProperty("eventsubject_id"), "id");
		library.Entertext(object.getProperty("eventsubject_xpath"), "xpath", sub);
		log.info("Subject Entered");
		
	}
	
	public void enterDescription(String desc)
	{
		//library.clearTextbox(object.getProperty("eventdescription_id"), "id");
		library.Entertext(object.getProperty("eventdescription_xpath"), "xpath", desc);
		log.info("Description Entered");
	}
	
	public void selectCompany(int cmpny)
	{
		library.selectIndex(object.getProperty("eventcompany_xpath"), "xpath", cmpny);
		log.info("Value "+cmpny+" selected");
	}
	public void selectCompany(String cmpny)
	{
		library.selectvalue(object.getProperty("eventcompany_xpath"), "xpath", cmpny);
		log.info("Value "+cmpny+" selected");
	}
	
	public void selectAssignAdmin(String adm)
	{
		library.selectvalue(object.getProperty("eventassignadmin_xpath"), "xpath", adm);
		log.info("value "+adm+ " Selected");
	}
	public void selectAssignAdmin(int adm)
	{
		library.selectIndex(object.getProperty("eventassignadmin_xpath"), "xpath", adm);
		log.info("value "+adm+ " Selected");
	}
	
	public void enterLocation(String loc)
	{
		library.clearTextbox(object.getProperty("eventlocation_xpath"), "xpath");
		library.Entertext(object.getProperty("eventlocation_xpath"), "xpath", loc);
		log.info("Location entered is"+loc);
	}
	public void enterScheduleDate(String sdate)
	{
		library.clearTextbox(object.getProperty("eventscheduledate_xpath"), "xpath");
		library.Entertext(object.getProperty("eventscheduledate_xpath"), "xpath", sdate);
		log.info("Location entered is"+sdate);
	}
	public void enterScheduleTime(String stime)
	{
		library.clearTextbox(object.getProperty("eventscheduletime_xpath"), "xpath");
		library.Entertext(object.getProperty("eventscheduletime_xpath"), "xpath", stime);
		log.info("Location entered is"+stime);
	}
	public void enterEndDate(String edate)
	{
		library.clearTextbox(object.getProperty("eventenddate_xpath"), "xpath");
		library.Entertext(object.getProperty("eventenddate_xpath"), "xpath", edate);
		log.info("Location entered is"+edate);
	}
	public void enterEndTime(String etime)
	{
		library.clearTextbox(object.getProperty("eventendtime_xpath"), "xpath");
		library.Entertext(object.getProperty("eventendtime_xpath"), "xpath", etime);
		log.info("Location entered is"+etime);
	}
	public void clickSave()
	{
		library.clickonwebelement(object.getProperty("eventsave_xpath"), "xpath");
	}
	public void clickCancel()
	{
		library.clickonwebelement(object.getProperty("eventcancel_xpath"), "xpath");
	}
}
