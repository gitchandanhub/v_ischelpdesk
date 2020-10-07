package EEExecution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseDriver;
import Base.Library;
import pagescreen.Loginpage;
import pagescreen.SignUpPage;
import utility.ExcelUtility;

public class ExecuteSignup extends BaseDriver
{
	Loginpage lpobj;  
	public ExecuteSignup()
	{
		super();
		lpobj =  new Loginpage();  
		
	}
	
	@Test
	public void signupuser() throws IOException
	{
		lpobj.clicksignup();
		
		SignUpPage spobj = new SignUpPage();
		
		spobj.enterCompany(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 0));
		log.info("CompanyName entered");
		spobj.enterFirstname(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 1));
		log.info("CompanyName entered");
		spobj.enterLastname(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 2));
		log.info("CompanyName entered");	
		spobj.enterlAddress(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 3));
		log.info("Address Entered");
		spobj.enterCity(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 4));
		log.info("City entered");
		spobj.selectState(ExcelUtility.numreadexcel(config.getProperty("signupuserdetails"), 0, 1, 5));
		log.info("State selected");
		spobj.selectState(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 5));
		log.info("State selected");
		spobj.Enterzip(ExcelUtility.readexcel(config.getProperty("signupuserdetails"), 0, 1, 6));
		log.info(" Zip Entered ");
		spobj.Enterzip(ExcelUtility.numreadexcel(config.getProperty("signupuserdetails"), 0, 1, 6));
		log.info(" Zip Entered ");
		
		

	}
}
