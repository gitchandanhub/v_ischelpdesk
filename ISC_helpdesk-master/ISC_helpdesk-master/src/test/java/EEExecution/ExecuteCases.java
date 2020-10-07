package EEExecution;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseDriver;
import pagescreen.ContactsPage;
import pagescreen.DashboardPage;
import pagescreen.Loginpage;
import pagescreen.NewEvent;
import pagescreen.NewTicket;
import pagescreen.PasswordsPage;
import pagescreen.PurchasePage;
import pagescreen.ReportsPage;
import utility.ExcelUtility;
@Listeners(Listen.TestNG_Listeners.class)
public class ExecuteCases  extends BaseDriver
   {
	Loginpage lpobj;  
	public ExecuteCases()
	{
		super();
		lpobj =  new Loginpage();  
		
	}
	@Test(priority = 0)
	public void ValidateLogin() throws InterruptedException
	{
		System.out.println(config.getProperty("username"));
		lpobj.EnterUsername(config.getProperty("username"));
		lpobj.EnterPassword(config.getProperty("password"));
		lpobj.clickloginbutton();
		Thread.sleep(1000);
		try {
			
		
		if(object.getProperty("Question_id").contains("ddlQuestion"))
		{
			lpobj.selectquuestion(2);
			Thread.sleep(1000);
			lpobj.EnterAnswer("1");
			lpobj.clicksubmit();
		}
		
		}
		catch(Exception e)
		{
			System.out.println("No security Answer Required");
		}
	}
	//******************************************* To Create newEvent***************************************
	@Test(enabled =false)
	public void newEvent() throws InterruptedException, IOException
	{
		DashboardPage dbpobj = new DashboardPage();
		NewEvent event = new NewEvent();
		
		dbpobj.clickonNewEvent();
		Thread.sleep(1000);
		List <WebElement> allframes = driver.findElements(By.tagName("iframe"));
		//allframes.get(0);
		
		driver.switchTo().frame(allframes.get(0));
		Thread.sleep(1000);
		
		//driver.findElement(By.id("txtSubject")).sendKeys("rsgdhgdh");
		
		
		event.enterSubject(ExcelUtility.readexcel(config.getProperty("neweventsetup"), 0, 1, 0));
		
		event.enterDescription(ExcelUtility.readexcel(config.getProperty("neweventsetup"), 0, 1, 1));
		
		String companydata = (ExcelUtility.readexcel(config.getProperty("neweventsetup"), 0, 1, 2));
		System.out.println(companydata);
		WebElement cmpname= driver.findElement(By.xpath("//a[@id='SkinnedCustomer_ID']"));
		cmpname.click();
		driver.findElement(By.xpath("//li[contains(text(),'"+companydata+"')]")).click();
		
		String assignnamedata = (ExcelUtility.readexcel(config.getProperty("neweventsetup"), 0, 1, 3));
		System.out.println(assignnamedata);
		WebElement username= driver.findElement(By.xpath("//a[@id='SkinnedUser_ID']"));
		username.click();
		driver.findElement(By.xpath("//li[contains(text(),'"+assignnamedata+"')]")).click();
		event.enterLocation(ExcelUtility.readexcel(config.getProperty("neweventsetup"), 0, 1, 4));
		
		event.enterScheduleDate(ExcelUtility.getATdata(config.getProperty("neweventsetup"), 0, 1, 5));
		
		
		event.enterScheduleTime(ExcelUtility.getATdata(config.getProperty("neweventsetup"), 0, 1, 6));
		
		event.enterEndDate(ExcelUtility.getATdata(config.getProperty("neweventsetup"), 0, 1, 7));
		
		event.enterScheduleTime(ExcelUtility.getATdata(config.getProperty("neweventsetup"), 0, 1, 8));
		
		event.clickSave();
	}
	
	//**************************************To create New Tickect***********************************************
	@Test(enabled =false)
	public void newTicket() throws InterruptedException, IOException
	{
		DashboardPage dp = new DashboardPage();
		NewTicket ticket = new NewTicket();
		dp.clickonNewServiceTicket();
		Thread.sleep(2000);
		
		List <WebElement> tickframe = driver.findElements(By.tagName("iframe"));
		
		driver.switchTo().frame(tickframe.get(0));
		Thread.sleep(2000);
		
		
		ticket.enterMessage(ExcelUtility.readexcel(config.getProperty("serviceticket"), 0, 1, 0));
		
		ticket.enterTechnicalNotes(ExcelUtility.readexcel(config.getProperty("serviceticket"), 0, 1, 1));
		
		String companyname = ExcelUtility.readexcel(config.getProperty("serviceticket"), 0, 1, 3);
		System.out.println(companyname);
		WebElement cnd = driver.findElement(By.xpath("//a[@id='SkinnedCustomer_ID']"));
		cnd.click();
		driver.findElement(By.xpath("//li[contains(text(),'"+companyname+"')]")).click();
		Thread.sleep(1000);
		String username = ExcelUtility.readexcel(config.getProperty("serviceticket"), 0, 1, 4);
		System.out.println(username);
		WebElement und = driver.findElement(By.xpath("//a[@id='SkinnedUser_ID']"));
		und.click();
		driver.findElement(By.xpath("//div[@class='rfdSelectBox rfdSelectBox_Office2007']//li[contains(text(),'"+username+"')]")).click();
		
		String stypedata = ExcelUtility.readexcel(config.getProperty("serviceticket"), 0, 1, 5);
		System.out.println(stypedata);
		WebElement std = driver.findElement(By.xpath("//a[@id='SkinnedServiceType_ID']"));
		std.click();
		driver.findElement(By.xpath("//li[contains(text(),'"+stypedata+"')]")).click();
		
		String prioritydata = ExcelUtility.readexcel(config.getProperty("serviceticket"), 0, 1, 6);
		System.out.println(prioritydata);
		WebElement prtd = driver.findElement(By.xpath("//a[@id='SkinnedPriority_ID']"));
		prtd.click();
		driver.findElement(By.xpath("//li[contains(text(),'"+prioritydata+"')]")).click();
		
		WebElement ticketno = driver.findElement(By.xpath("//input[@id='Ticket_Number']"));
		System.out.println(ticketno.getText());
		
		ticket.clickonSubmit();
		
		//driver.switchTo().alert().accept();
		
		
		
	}
	//*************************************To Generate Reports***********************************************
	@Test(enabled = false)
	public void generateReport() throws InterruptedException, IOException
	{
		DashboardPage rdpobj = new DashboardPage();
		ReportsPage report = new ReportsPage();
		
		rdpobj.clickonReports();
		Thread.sleep(1000);
		
		String reportsdata = ExcelUtility.readexcel(config.getProperty("reportstab"), 0, 1, 0);
		System.out.println(reportsdata);
		
		WebElement rptfor = driver.findElement(By.xpath("//a[@id='Skinnedctl00_MainContent_cmbReportfor']/span"));
		rptfor.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'"+reportsdata+"')]")).click();
		
		String cpmpanydata = ExcelUtility.readexcel(config.getProperty("reportstab"), 0, 1, 1);
		System.out.println(cpmpanydata);
		
		WebElement compnm = driver.findElement(By.xpath("//a[@id='Skinnedctl00_MainContent_cmbCompanyReport']/span"));
		compnm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='rfdSelectBox rfdSelectBox_Office2007']//li[contains(text(),'"+cpmpanydata+"')]")).click();
		
		report.clickOnReport();
		
	}
	@Test(enabled = false)
	public void addNewcontact() throws InterruptedException, IOException
	{
		DashboardPage cdpobj = new DashboardPage();
		ContactsPage cpobj = new ContactsPage();
		
		cdpobj.clickonContacts();
		Thread.sleep(1000);
		
		cpobj.clickOnAdd();
		Thread.sleep(1000);
		
		//*****************TO Switch Into Frame******************
		List <WebElement> contframe = driver.findElements(By.tagName("iframe"));	
		driver.switchTo().frame(contframe.get(0));
		Thread.sleep(2000);		
		
		//*********************Selecting company name*****************
		WebElement cpn = driver.findElement(By.xpath("//a[@id='SkinnedddlCompany']"));
		cpn.click();
		Thread.sleep(1000);
		String compnam = ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 0);
		System.out.println(compnam);
		driver.findElement(By.xpath("//li[contains(text(),'"+compnam+"')]")).click();
		
		//************************Entering Details from Excel**********************
		cpobj.enterFullName(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 1));
		
		cpobj.enterBusinessName(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 2));
		
		cpobj.enterJobTitle(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 3));
		
		cpobj.enterEmail(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 4));
		
		cpobj.enterDisplayas(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 5));
		
		cpobj.enterWebPageaddress(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 6));
		
		cpobj.enterIMAddress(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 7));
		
		cpobj.enterBusinessnum(ExcelUtility.numreadexcel(config.getProperty("contactstab"), 0, 1, 8));
		
		cpobj.enterHomenum(ExcelUtility.numreadexcel(config.getProperty("contactstab"), 0, 1, 9));
		
		cpobj.enterFaxnum(ExcelUtility.numreadexcel(config.getProperty("contactstab"), 0, 1, 10));
		
		cpobj.enterMobilenum(ExcelUtility.numreadexcel(config.getProperty("contactstab"), 0, 1, 11));
		
		cpobj.enterBusinessAddress(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 12));
		
		cpobj.enterNotes(ExcelUtility.readexcel(config.getProperty("contactstab"), 0, 1, 13));
		
		cpobj.clickOnSubmit();
		
	
		
	}
	
	@Test(enabled = false)
	public void createPassword() throws InterruptedException, IOException
	{
		DashboardPage pdpobj = new DashboardPage();
		PasswordsPage pobj = new PasswordsPage();
		
		pdpobj.clickonPasswords();
		Thread.sleep(1000);
		
		pobj.createPasswords();
		
		
		//*****************TO Switch Into Frame******************
				List <WebElement> contframe = driver.findElements(By.tagName("iframe"));	
				driver.switchTo().frame(contframe.get(0));
				Thread.sleep(2000);		
				
				//*********************Selecting company name*****************
				WebElement cpn = driver.findElement(By.xpath("//input[@id='cmbCompany_Input']"));
				cpn.click();
				Thread.sleep(1000);
				String passcompnam = ExcelUtility.readexcel(config.getProperty("passwordstab"), 0, 1, 0);
				System.out.println(passcompnam);
				driver.findElement(By.xpath("//li[contains(text(),'"+passcompnam+"')]")).click();
				//li[contains(@class,'rcbHovered')]
				
				//************************Entering Details from Excel**********************
				
				pobj.enterUserName(ExcelUtility.readexcel(config.getProperty("passwordstab"), 0, 1, 1));
				
				pobj.enterPassword(ExcelUtility.readexcel(config.getProperty("passwordstab"), 0, 1, 2));
				
				pobj.enterDescription(ExcelUtility.readexcel(config.getProperty("passwordstab"), 0, 1, 3));
				
				pobj.enterReference(ExcelUtility.readexcel(config.getProperty("passwordstab"), 0, 1, 4));
				
				pobj.clikOnSubmit();
	}
	@Test
	public void createPurchaseOrder() throws InterruptedException, IOException
	{
		DashboardPage podpobj = new DashboardPage();
		podpobj.clickonPurchases();
		Thread.sleep(1000);
		
		PurchasePage ppojj = new PurchasePage();
		ppojj.clickOnAddbtn();
		Thread.sleep(1000);
		
		//*****************TO Switch Into Frame******************
				List <WebElement> contframe = driver.findElements(By.tagName("iframe"));	
				driver.switchTo().frame(contframe.get(0));
				Thread.sleep(2000);	
				
		ppojj.enterDate(ExcelUtility.getATdata(config.getProperty("purchaseorders"), 0, 1, 1));
		
		ppojj.selectCompanyname();
		ppojj.selectUsername();
		
		ppojj.enterReferenceNum(ExcelUtility.numreadexcel(config.getProperty("purchaseorders"), 0, 1, 4));
		
		ppojj.enterDateReq(ExcelUtility.getATdata(config.getProperty("purchaseorders"), 0, 1, 5));
		ppojj.enterComment(ExcelUtility.readexcel(config.getProperty("purchaseorders"), 0, 1, 6));
		ppojj.enterQty1(ExcelUtility.numreadexcel(config.getProperty("purchaseorders"), 0, 1, 7));
		ppojj.enter1Description(ExcelUtility.readexcel(config.getProperty("purchaseorders"), 0, 1, 8));
		ppojj.enterUnitPrice1(ExcelUtility.numreadexcel(config.getProperty("purchaseorders"), 0, 1, 9));
		ppojj.enterQty2(ExcelUtility.numreadexcel(config.getProperty("purchaseorders"), 0, 2, 7));
		ppojj.enter2Description(ExcelUtility.readexcel(config.getProperty("purchaseorders"), 0, 2, 8));
		ppojj.enterUnitPrice2(ExcelUtility.numreadexcel(config.getProperty("purchaseorders"), 0, 2, 9));
		ppojj.enterApproveDate(ExcelUtility.getATdata(config.getProperty("purchaseorders"), 0, 1, 10));
		ppojj.enterApprover(ExcelUtility.readexcel(config.getProperty("purchaseorders"), 0, 1, 11));
		ppojj.clickOnSubmit();
	}
	
	
   }
