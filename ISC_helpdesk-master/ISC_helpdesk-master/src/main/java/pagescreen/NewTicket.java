package pagescreen;

import Base.BaseDriver;
import Base.Library;

public class NewTicket extends BaseDriver
{
	Library library;
	public NewTicket()
	{
		super();
		library = new Library();
	}
	
	public void enterMessage(String smsg)
	{
		library.clearTextbox(object.getProperty("servicemessage_id"), "id");
		library.Entertext(object.getProperty("servicemessage_id"), "id", smsg);
		log.info("message entered");
	}
	public void enterTechnicalNotes(String notes) 
	{
		library.clearTextbox(object.getProperty("servicenote_id"), "id");
		library.Entertext(object.getProperty("servicenote_id"), "id", notes);
		log.info("message entered");
	}
	public void clickonSubmit()
	{
		library.clickonwebelement(object.getProperty("servicesubbtn_id"), "id");
		log.info("Clicked on Submit");
	}
	public void clickonCancel()
	{
		library.clickonwebelement(object.getProperty("servicecaclbtn_id"), "id");
		log.info("Clicked on Cancel");
	}
//	public void selectServiceType()
//	{
//		library.selectvalue(object.getProperty("servicetype_id"), "id", 0);
//	}
	
}
