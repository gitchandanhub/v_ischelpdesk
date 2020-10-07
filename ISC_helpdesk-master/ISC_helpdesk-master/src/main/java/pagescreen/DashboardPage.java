package pagescreen;

import Base.BaseDriver;
import Base.Library;

public class DashboardPage extends BaseDriver
{
	Library library;
	public DashboardPage()
	{
		super();
		library = new Library();
	}
	public void clickonDashBoard()
	{
		library.clickonwebelement(object.getProperty("dashboardtab_id"), "id");
		log.info("DashBoard Tab Clicked");
	}
	public void clickonScheduling()
	{
		library.clickonwebelement(object.getProperty("schedulingtab_id"), "id");
		log.info("Scheduling Tab Clicked");
	}
	public void clickonTickects()
	{
		library.clickonwebelement(object.getProperty("ticketstab_id"), "id");
		log.info("Tickets Tab Clicked");
	}
	public void clickonBilling()
	{
		library.clickonwebelement(object.getProperty("billingtab_id"), "id");
		log.info("Billing Tab Clicked");
	}
	public void clickonDivices()
	{
		library.clickonwebelement(object.getProperty("devicestab_id"), "id");
		log.info("Devices Tab Clicked");
	}
	public void clickonPasswords()
	{
		library.clickonwebelement(object.getProperty("passwordstab_id"), "id");
		log.info("passwords Tab Clicked");
	}
	public void clickonPurchases()
	{
		library.clickonwebelement(object.getProperty("purchasestab_id"), "id");
		log.info("Purchases Tab Clicked");
	}
	public void clickonContacts()
	{
		library.clickonwebelement(object.getProperty("contactstab_id"), "id");
		log.info("Contacts Tab Clicked");
	}
	public void clickonReports()
	{
		library.clickonwebelement(object.getProperty("reportstab_id"), "id");
		log.info("Reports Tab Clicked");
	}
	public void clickonSystems()
	{
		library.clickonwebelement(object.getProperty("systemtab_id"), "id");
		log.info("Systems Tab Clicked");
	}
	public void clickonNewServiceTicket()
	{
		library.clickonwebelement(object.getProperty("newserviceticket"), "id");
		log.info("Clicked on New for Service Ticket");
	}
	public void clickonGoButton()
	{
		library.clickonwebelement(object.getProperty("gobutton_id"), "id");
		log.info("Go Button Clicked");
	}
	public void clickonNewEvent()
	{
		library.clickonwebelement(object.getProperty("neweventsetup"), "id");
		log.info("Clicked on New for Event");
	}
}
