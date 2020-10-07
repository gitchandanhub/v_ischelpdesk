package pagescreen;

import Base.BaseDriver;
import Base.Library;

public class SignUpPage  extends BaseDriver
{
	Library library;
	public SignUpPage()
	{
		super();
	library  = new Library();	
	}
	
	public void enterCompany(String cmp)
	{
		library.clearTextbox(object.getProperty("scompanyname_id"), "id");
		library.Entertext(object.getProperty("scompanyname_id"), "id", cmp);
		log.info("Companeyname Entered");
	}
	public void enterFirstname(String fname)
	{
		library.clearTextbox(object.getProperty("sfirstname_id"), "id");
		library.Entertext(object.getProperty("sfirstname_id"), "id", fname);
		log.info("Firstname Entered");
	}
	public void enterLastname(String lname)
	{
		library.clearTextbox(object.getProperty("slastname_id"), "id");
		library.Entertext(object.getProperty("slastname_id"), "id", lname);
		log.info("Lasttname Entered");
	}
	public void enterlAddress(String addr)
	{
		library.clearTextbox(object.getProperty("saddress_id"), "id");
		library.Entertext(object.getProperty("saddress_id"), "id", addr);
		log.info("EmailAddress Entered");
	}
	public void enterCity(String ct)
	{
		library.clearTextbox(object.getProperty("scity_id"), "id");
		library.Entertext(object.getProperty("scity_id"), "id", ct);
		log.info("City Entered");
	}
	public void selectState(int st)
	{
		library.selectIndex(object.getProperty("sstate_id"), "id", st);
		log.info("State Entered");
	}
	public void selectState(String st)
	{
		library.selectvalue(object.getProperty("sstate_id"), "id", st);
		log.info("State Entered");
	}
	public void Enterzip(int zipc )
	{
		library.clearTextbox(object.getProperty("szip_id"), "id");
		library.Enternumerictext(object.getProperty("szip_id"), "id", zipc);
		log.info("zip Entered");
	}
	
	public void Enterzip(String zipc )
	{
	library.clearTextbox(object.getProperty("szip_id"), "id");
	library.Entertext(object.getProperty("szip_id"), "id", zipc);
	log.info("zip Entered");
	}
	public void enterPhone(int phn)
	{
		library.clearTextbox(object.getProperty("sphone_id"), "id");
		library.Enternumerictext(object.getProperty("sphone_id"), "id", phn);
		log.info("Phone Number Entered");
	}
	public void enterPhone(String phn)
	{
		library.clearTextbox(object.getProperty("sphone_id"), "id");
		library.Entertext(object.getProperty("sphone_id"), "id", phn);
		log.info("Phone Number Entered");
	}
	public void enterUsername(String uname)
	{
		library.clearTextbox(object.getProperty("susername_id"), "id");
		library.Entertext(object.getProperty("susername_id"), "id", uname);
		log.info("UserName Entered");
	}
	public void enterPassword(String upwd)
	{
		library.clearTextbox(object.getProperty("spassword_id"), "id");
		library.Entertext(object.getProperty("spassword_id"), "id", upwd);
		log.info("Password Entered");
	}
	public void enterEmailAddress(String uemail)
	{
		library.clearTextbox(object.getProperty("semailaddress_id"), "id");
		library.Entertext(object.getProperty("semailaddress_id"), "id", uemail);
		log.info("User EmailAddress Entered");
	}
	public void selectTndCCheckbox()
	{
		library.selectCheckbox(object.getProperty("stnccheckbox_id"), "id");
	}
	public void clickSubmitbutton() 
	{
		library.clickonwebelement(object.getProperty("ssubmitbutton_id"), "id");
		log.info("Submit button Clicked ");
	}
	
	public void clickNewbutton() 
	{
		library.clickonwebelement(object.getProperty("snewbutton_id"), "id");
		log.info("New button Clicked ");
	}
	public void clickLoginbutton() 
	{
		library.clickonwebelement(object.getProperty("sloginbutton_id"), "id");
		log.info("Login button Clicked ");
	}
	
}
