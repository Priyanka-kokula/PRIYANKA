package sfdctestcases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDC_Complete_TestCases {
	
	static WebDriver driver = null;
	private static WebElement selectMenu;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		TC_login_01();
//		TC_LogintoSFDC_02();
//		TC_CheckRememberme_03();
//		TC_ForgotPassword_04A();
//		TC_ForgotPassword_04B();
//		TC_05();
//		TC_06();
//		TC_07();
//		TC_08();
//		TC_09();
//	     TC_10();
//		TC_11();
//		TC_12();
//		TC_13();
//		TC_14();
//		TC_15();
	
//		TC_16();
//		TC_17();
//		TC_18();
//		TC_19();
//		TC_20();
//		TC_21();
//		TC_22();
//		TC_23();
//		TC_24();
//		TC_25();
//		TC_26();
//		TC_27();
//		TC_28();
//		TC_29();
//		TC_30();
//		TC_31();
//		TC_32();
//		TC_33();
//		TC_34();
//		TC_35();
//		TC_36();
		TC_37();
		//		TC_Fileupload_06();
	}

	static void TC_login_01() {
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.name("Login")).click();
	}
	 static void TC_LogintoSFDC_02() {
	
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
	driver.findElement(By.id("password")).sendKeys("Maanya#123");
	driver.findElement(By.name("Login")).click();
	
	 }
	 
	 static void TC_CheckRememberme_03() {
		 
		    driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
			driver.findElement(By.id("password")).sendKeys("Maanya#123");
			driver.findElement(By.name("rememberUn")).click();
			driver.findElement(By.name("Login")).click();
	 }
	 
	 static void TC_ForgotPassword_04A() {
		 
	    driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
			driver.findElement(By.id("forgot_password_link")).click();
	 }
	 static void TC_ForgotPassword_04B() {
	 
	    driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("2231");
		driver.findElement(By.name("Login")).click();
	 }

	 static void TC_05() {

		    driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
			driver.findElement(By.id("password")).sendKeys("Maanya#123");
			driver.findElement(By.name("rememberUn")).click();
			driver.findElement(By.name("Login")).click();
			driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
	 }
	 
	 static void TC_06() throws InterruptedException {
		 
		    driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
			driver.findElement(By.id("password")).sendKeys("Maanya#123");
			driver.findElement(By.name("rememberUn")).click();
			driver.findElement(By.name("Login")).click();
			driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		    driver.manage().window().maximize();
		   Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
			WebElement myFrame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		    driver.switchTo().frame(myFrame);
			driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
			driver.findElement(By.id("lastName")).clear();
			driver.findElement(By.id("lastName")).sendKeys("Maanya");
			driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
			driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'File')]")).click();
			driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
			WebElement choosefile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
			choosefile.sendKeys("C:\\Users\\Chiranjivi\\Desktop\\HACKTHON ANS\\HQ10.png");
			driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	 }
			
			static void TC_07() throws InterruptedException {
			
			driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
			driver.findElement(By.id("password")).sendKeys("Maanya#123");
			driver.findElement(By.name("rememberUn")).click();
			driver.findElement(By.name("Login")).click();
			driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();	    
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']")).click();
		    driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		    driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		    WebElement displayAndLayout = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
			displayAndLayout.click();
			WebElement customizeMyTabLink = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
			customizeMyTabLink.click();
			WebElement customApp = driver.findElement(By.xpath("//select[@id='p4']"));
			Select SalesForceChatter = new Select(customApp);
			SalesForceChatter.selectByIndex(3);

			WebElement availableTabListBox = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
			WebElement SelectedTabsListBox = driver.findElement(By.xpath("//select[@id='duel_select_1']"));//// select[@id='duel_select_1']

			Select reportSelected = new Select(SelectedTabsListBox);
			// Get all options
			java.util.List<WebElement> SelectedTabOptions = reportSelected.getOptions();

			// Get the length
		System.out.println(SelectedTabOptions.size());

			// Loop to print one by one
			for (int j = 0; j < SelectedTabOptions.size(); j++) {
				if (SelectedTabOptions.get(j).getText().equals("Reports")) {

					reportSelected.selectByVisibleText("Reports");
					WebElement RemoveButton = driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
					RemoveButton.click();
					break;
				}
			}
			Select report = new Select(availableTabListBox);
			report.selectByVisibleText("Reports");
			WebElement addButton = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
			addButton.click();
			WebElement saveButton = driver.findElement(By.xpath("//input[@name='save']"));
			saveButton.click();

			WebElement MySetting = driver.findElement(By.xpath("//span[contains(text(),'My Settings')]"));
			MySetting.click();

			WebElement email = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
			email.click();
			WebElement myEmailSetting = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
			myEmailSetting.click();
			WebElement emailName = driver.findElement(By.xpath("//input[@id='sender_name']"));
			emailName.sendKeys("pinky");
			WebElement emailAddress = driver.findElement(By.xpath("//input[@id='sender_email']"));
			emailAddress.sendKeys("priyanka.kokula88@gmail.com");
			WebElement radioButton = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
			radioButton.click();
			WebElement saveButton1 = driver.findElement(By.xpath("//input[@name='save']"));
			saveButton1.click();
			WebElement calenderAndReminder = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
			calenderAndReminder.click();
			WebElement activityReminder = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
			activityReminder.click();
			String MainWindow = driver.getWindowHandle();
			System.out.println("Main hdl " + MainWindow);
			WebElement previewReminder = driver.findElement(By.xpath("//input[@id='testbtn']"));
			previewReminder.click();
			Thread.sleep(4000);
			Set<String> windowIterator = driver.getWindowHandles();
			System.err.println("No of windows :  " + windowIterator.size());
			for (String s : windowIterator) {
             String windowHandle = s;
			System.out.println("Inside Loop " + windowHandle);
			if (!MainWindow.equals(windowHandle)) {
			WebDriver popup = driver.switchTo().window(windowHandle);
			System.out.println("Window Title : " + popup.getTitle());
     		System.out.println("Window Url : " + popup.getCurrentUrl());
			// popup.close();
			// driver.switchTo().window(windowHandle).close();
            WebElement dissmissAll = popup.findElement(By.xpath("//input[@id='dismiss_all']"));
			dissmissAll.click();
			}
			}
			// driver.close();
			driver.switchTo().window(MainWindow);
			Set<String> windowIterator1 = driver.getWindowHandles();
			System.err.println("No of windows after :  " + windowIterator1.size());

		}
		
			static void TC_08() throws InterruptedException {
				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();	 
				Thread.sleep(5000);
				System.out.println("Developer Console clicked");
				String primaryWindow = driver.getWindowHandle();
				for (String handle : driver.getWindowHandles()) {
					System.out.println("No of handles " + handle);
					driver.switchTo().window(handle);
				}
				System.out.println("Swicthed to developer console window");
				Thread.sleep(5000);
				driver.close();
				System.out.println("Closing open window");
				driver.switchTo().window(primaryWindow);
				System.out.println("Switched to main window ");
			}
				
			    
			
			static void TC_09() {
				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();	
						
			
			}
		   static void TC_10() throws InterruptedException {
			   
			   driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
				account.click();
				WebElement new1 = driver.findElement(By.xpath("//input[@name='new']"));
				new1.click();
				Thread.sleep(5000);
				System.out.println("clicked");
				driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Pinky");
							
				driver.findElement(By.xpath("//select[@id='acc6']")).sendKeys("Technology Partner");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//select[@id='00N6g00000MwmwN']")).sendKeys("High");
				
				WebElement saveBtn = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
				saveBtn.click();
				
		   }
		   
		   static void TC_11() throws InterruptedException {
			   driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
				account.click();
				driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
				driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Priya");
				driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("Maanya");
				WebElement saveBtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
				saveBtn.click();
		   }
				
				static void TC_12() throws InterruptedException {
					
					driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
					account.click();
					WebElement viewNames = driver.findElement(By.xpath("//select[@id='fcf']"));
					Select viewdropdown = new Select(viewNames);
					java.util.List<WebElement> list = viewdropdown.getAllSelectedOptions();
					System.out.println(list.get(0).getText());
					WebElement viewNames1 = driver.findElement(By.xpath("//select[@id='fcf']"));
					Select viewdropdown1 = new Select(viewNames1);
					java.util.List<WebElement> list1 = viewdropdown1.getAllSelectedOptions();
					System.out.println(list1.get(0).getText());
					
					WebElement btnEditView = driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));
					btnEditView.click();
					System.out.println("Edit button clicked");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("New View Name");
					String accountOptions = "All Accounts";
					if (accountOptions.equals("All Accounts"))
						driver.findElement(By.xpath("//input[@id='fscope0']")).click();
					else 
						driver.findElement(By.xpath("//input[@id='fscope1']")).click();

					System.out.println("Accounts radiobutton clicked");
					WebElement addField = driver.findElement(By.xpath("//select[@id='fcol1']"));
					Select addFieldDropdown = new Select(addField);
					addFieldDropdown.selectByIndex(0);
					WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']"));
					Select operatorDropdown = new Select(operator);
					operatorDropdown.selectByIndex(0);
					driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("<a>");
					WebElement availablefields = driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
					Select availablefieldsdropdown = new Select(availablefields);
					availablefieldsdropdown.selectByVisibleText("Last Activity");
					System.out.println("Last activity selected");
					driver.findElement(By.xpath("//img[@class='rightArrowIcon']" + "")).click();
					System.out.println("add Button clicked");
					WebElement saveBtn = driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
					saveBtn.click();
				}
				
				static void TC_13() throws InterruptedException {
					
					driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
					account.click();
					driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
					driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Account");
					driver.findElement(By.xpath("//input[@name='srchbutton']")).click();
					List<WebElement> listofAccounts = driver
							.findElements(By.xpath("//th[contains(@class,'booleanColumn')]  [@scope='row']"));
					if (listofAccounts.isEmpty())
						
					if (listofAccounts.size() > 2) {
						listofAccounts.get(0).click();
						listofAccounts.get(1).click();
					}
					
					driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"))
							.click();
					
					driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
					System.out.println("Merge button clicked");
					

				}
				static void TC_14() throws InterruptedException {
					
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
				account.click();
				
				
				driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
				WebElement dateField = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
				dateField.sendKeys("Created Date");
				WebElement enddate = driver.findElement(By.name("endDate"));
				WebElement startdate = driver.findElement(By.name("startDate"));
				
				startdate.clear();
				enddate.clear();
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				
			
				LocalDate localDate = LocalDate.now();
				startdate.sendKeys(dtf.format(localDate));
			enddate.sendKeys(dtf.format(localDate));
			
			Thread.sleep(2000);
				WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
				save.click();

				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("Report 4");

			    driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).sendKeys("Report_Unique_4");

				driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']//tbody//tr//td[@class='x-btn-mc']//button")).click();
				Thread.sleep(2000);
				
		}
				static void TC_15() throws InterruptedException {
					
					driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
					account.click();
					driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"))
					.click();
					
					driver.findElement(By.xpath("//select[@id='fcf']")).click();
					
				}
					static void TC_16() throws InterruptedException {
						
						driver.get("https://login.salesforce.com");
						driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
						driver.findElement(By.id("password")).sendKeys("Maanya#123");
						driver.findElement(By.name("rememberUn")).click();
						driver.findElement(By.name("Login")).click();
						driver.findElement(By.id("Account_Tab")).click();
						Thread.sleep(5000);
						WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
						closePopUpWindow.click();
						WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
						account.click();
						driver.findElement(By.xpath(" //a[contains(text(),'Opportunities')]")).click();
						
						driver.findElement(By.xpath("//input[@name='new']")).click();
						
						driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Opp name2");
						
						driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys("Priyanka Maanya");
						

						
						WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
						Select stageDD = new Select(stage);
						stageDD.selectByIndex(1);
						
						WebElement leadSource = driver.findElement(By.xpath("//select[@id='opp6']"));
						Select leadSourceDD = new Select(leadSource);
						leadSourceDD.selectByIndex(1);
						
						driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
						
					}
						
					static void TC_17() throws InterruptedException {
						
					
					driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
					account.click();
					driver.findElement(By.xpath(" //a[contains(text(),'Opportunities')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
					
					
					}
		static void TC_18() throws InterruptedException {
						
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
		driver.findElement(By.id("password")).sendKeys("Maanya#123");
		driver.findElement(By.name("rememberUn")).click();
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.id("Account_Tab")).click();
		Thread.sleep(5000);
		WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
		closePopUpWindow.click();
		WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
		account.click();
		driver.findElement(By.xpath(" //a[contains(text(),'Opportunities')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]\r\n" + "")).click();
        
						
						
					}
						
						
			static void TC_19() throws InterruptedException {
							
					driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					WebElement account = driver.findElement(By.xpath("//*[@id='Account_Tab']"));
					account.click();
					driver.findElement(By.xpath(" //a[contains(text(),'Opportunities')]")).click();
							
					driver.findElement(By.xpath("//select[@id='quarter_q']")).click();
					driver.findElement(By.xpath("//select[@id='open']")).click();
							
			}
					
			static void TC_20() throws InterruptedException {
				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();	    
			    Thread.sleep(5000);
			
			
			driver.close();
			
		}
						
			static void TC_21() throws InterruptedException		{
				
			
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.xpath("//select[@id='scope']")).click();
				driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();	    
			    Thread.sleep(5000);
			
			
			driver.close();
			}
			
			static void TC_22() throws InterruptedException	{
			
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.xpath("//select[@id='fcf']"));
				driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
				WebElement usernameDropDown = driver.findElement(By.xpath("//div[@id='userNavButton']"));
				usernameDropDown.click();
				WebElement logOutBtn = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				logOutBtn.click();
				WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
				userName.sendKeys("priya@spicejet.com");
				WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("Maanya#123");
				WebElement loginBtn = driver.findElement(By.xpath("//input[@id='Login']"));
				loginBtn.click();
				System.out.println("entered login details");
				Thread.sleep(1000);
				WebElement viewList1 = driver.findElement(By.xpath("//select[@id='fcf']"));
				Select viewListDD1 = new Select(viewList1);
				Assert.assertEquals(viewListDD1.getFirstSelectedOption().getText(), "Today's Leads");
				
				
			}
			static void TC_23() throws InterruptedException	{
				
				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Leads")).click();
			    WebElement viewList = driver.findElement(By.xpath("//select[@id='fcf']"));
				Select viewListDD = new Select(viewList);
				viewListDD.selectByVisibleText("Today's Leads");
				
				
			}
			
			static void TC_24() throws InterruptedException {
				

				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.xpath("//input[@name='new']")).click();
				driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
				driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
				driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
				
			}
							
			static void TC_25() throws InterruptedException {
				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Contacts")).click();
			
				driver.findElement(By.xpath("//input[@name='new']")).click();
			
				driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Last Name");
			
				driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Priyanka Account");
				driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']")).click();
			
			}
			
			static void TC_26() throws InterruptedException {
			
				

				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
				String ViewName = "View temp5";
				driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(ViewName);
				
				WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
				viewUniqueName.clear();
				viewUniqueName.sendKeys("View_Unique");
				
				driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
				
				WebElement viewList1 = driver.findElement(By.name("fcf"));
				Select viewListDD1 = new Select(viewList1);
				Assert.assertEquals(viewListDD1.getFirstSelectedOption().getText(), ViewName);
				
				
			}
			
			static void TC_27() throws InterruptedException {

				
				driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Contacts")).click();
				WebElement recentList = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
				Select recentListDD = new Select(recentList);
				recentListDD.selectByVisibleText("Recently Created");
				
				
			}

           static void TC_28() throws InterruptedException {
        	   
        	   driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Contacts")).click();
				WebElement viewList = driver.findElement(By.xpath("//select[@id='fcf']"));
				Select viewListDD = new Select(viewList);
				viewListDD.selectByVisibleText("My Contacts");
        	   
           }
           
 static void TC_29() throws InterruptedException {
        	   
        	   driver.get("https://login.salesforce.com");
				driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
				driver.findElement(By.id("password")).sendKeys("Maanya#123");
				driver.findElement(By.name("rememberUn")).click();
				driver.findElement(By.name("Login")).click();
				driver.findElement(By.id("Account_Tab")).click();
				Thread.sleep(5000);
				WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
				closePopUpWindow.click();
				driver.findElement(By.linkText("Contacts")).click();
        	   
				WebElement contact = driver
						.findElement(By.xpath("//tr[contains(@class,'dataRow even first')]//th[contains(@class,'')]/a"));
				String temp = contact.getText();
				System.out.println("Contact name " + temp);
				contact.click();

				
				WebElement contactName = driver.findElement(By.xpath("//h2[@class='topName']"));
				Assert.assertEquals(temp, contactName.getText());
				
				
 }
 
      static void TC_30() throws InterruptedException {
    	  
    	  driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
			driver.findElement(By.id("password")).sendKeys("Maanya#123");
			driver.findElement(By.name("rememberUn")).click();
			driver.findElement(By.name("Login")).click();
			driver.findElement(By.id("Account_Tab")).click();
			Thread.sleep(5000);
			WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			closePopUpWindow.click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
			driver.findElement(By.xpath("//input[@id='fname']")).clear();
			WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
			viewUniqueName.clear();
			viewUniqueName.sendKeys("EFGH");
			driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
			WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]"));
			String actualErrorMessage = "Error: You must enter a value";
			Assert.assertEquals(errorMessage.getText(), actualErrorMessage);
						
      }
			 static void TC_31() throws InterruptedException {
    	  
				    driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					driver.findElement(By.linkText("Contacts")).click();
					driver.findElement(By.xpath("//input[@name='new']")).click();
					
					driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Last Name- Indian");
					
					driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Priyanka account");
					
					driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save_new']")).click();
					
					driver.findElement(By.xpath("//div[@class='errorMsg']"));
					WebElement newContact = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
					String labelDisplay = newContact.getText();
					Assert.assertEquals(labelDisplay, "New Contact");
					
					
					
 }			
			 static void TC_32() throws InterruptedException {
				 
				    driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					driver.findElement(By.linkText("Contacts")).click();
					driver.findElement(By.xpath("//input[@name='new']")).click();
					
					driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Last Name- Indian");
					
					driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
					
					driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save_new']")).click();
					
					driver.findElement(By.xpath("//div[@class='errorMsg']"));
					WebElement newContact = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
					String labelDisplay = newContact.getText();
					Assert.assertEquals(labelDisplay, "New Contact");
					
			 }
			 
			 static void TC_33() throws InterruptedException {
				 
				 driver.get("https://login.salesforce.com");
					driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
					driver.findElement(By.id("password")).sendKeys("Maanya#123");
					driver.findElement(By.name("rememberUn")).click();
					driver.findElement(By.name("Login")).click();
					driver.findElement(By.id("Account_Tab")).click();
					Thread.sleep(5000);
					WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
					closePopUpWindow.click();
					driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();
					
					driver.findElement(By.xpath("//a[contains(text(),'priyanka Maanya')]")).click();
					
			 }	
					
					 static void TC_34() throws InterruptedException {
						 
						    driver.get("https://login.salesforce.com");
							driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
							driver.findElement(By.id("password")).sendKeys("Maanya#123");
							driver.findElement(By.name("rememberUn")).click();
							driver.findElement(By.name("Login")).click();
							driver.findElement(By.id("Account_Tab")).click();
							Thread.sleep(5000);
							WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
							closePopUpWindow.click();
							driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();
							
							driver.findElement(By.xpath("//a[contains(text(),'priyanka Maanya')]")).click();
							driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
							WebElement myFrame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
						    driver.switchTo().frame(myFrame);
							driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
							driver.findElement(By.id("First Name")).click();
							driver.findElement(By.id("First Name")).sendKeys("priyanka");
							
					 }
						static void TC_35() throws InterruptedException {
							
							driver.get("https://login.salesforce.com");
							driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
							driver.findElement(By.id("password")).sendKeys("Maanya#123");
							driver.findElement(By.name("rememberUn")).click();
							driver.findElement(By.name("Login")).click();
							driver.findElement(By.id("Account_Tab")).click();
							Thread.sleep(5000);
							WebElement closePopUpWindow = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
							closePopUpWindow.click();
							driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
							driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
							driver.findElement(By.xpath("//option[contains(text(),'Forecasts')]")).click();
							
							driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
							driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
							WebElement usernameDropDown = driver.findElement(By.xpath("//div[@id='userNavButton']"));
							usernameDropDown.click();
							WebElement logOutBtn = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
							logOutBtn.click();
							WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
							userName.sendKeys("priya@spicejet.com");
							WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
							password.sendKeys("Maanya#123");
							WebElement loginBtn = driver.findElement(By.xpath("//input[@id='Login']"));
							loginBtn.click();
						}
							static void TC_36() throws InterruptedException {
								
								driver.get("https://login.salesforce.com");
								driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
								driver.findElement(By.id("password")).sendKeys("Maanya#123");
								driver.findElement(By.name("rememberUn")).click();
								driver.findElement(By.name("Login")).click();
								driver.findElement(By.id("Account_Tab")).click();
								Thread.sleep(5000);
								WebElement closePopUpWindow1 = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
								closePopUpWindow1.click();
								driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();
								driver.findElement(By.xpath("//a[contains(text(),'Friday May 1, 2020')]")).click();
								driver.findElement(By.xpath("//a[contains(text(),'8:00 AM')]")).click();
								driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")).click();
								driver.findElement(By.xpath("//input[@id='evt5']")).sendKeys("Other");
								driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).clear();
								driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).sendKeys("9:00PM");
								driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]\r\n" + 
										"								\r\n" + 
										"								")).click();
								
							}
								
								static void TC_37() throws InterruptedException {
									
									driver.get("https://login.salesforce.com");
									driver.findElement(By.id("username")).sendKeys("priya@spicejet.com");
									driver.findElement(By.id("password")).sendKeys("Maanya#123");
									driver.findElement(By.name("rememberUn")).click();
									driver.findElement(By.name("Login")).click();
									driver.findElement(By.id("Account_Tab")).click();
									Thread.sleep(5000);
									WebElement closePopUpWindow1 = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
									closePopUpWindow1.click();
									driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]")).click();
									driver.findElement(By.xpath("//a[contains(text(),'Friday May 1, 2020')]")).click();
									driver.findElement(By.xpath("//a[contains(text(),'8:00 AM')]")).click();
									driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")).click();
									driver.findElement(By.xpath("//input[@id='evt5']")).sendKeys("Other");
									driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).clear();
									driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).sendKeys("7:00PM");
									driver.findElement(By.xpath("//h3[contains(text(),'Recurrence')]")).click();
									driver.findElement(By.xpath("//label[contains(text(),'Create Recurring Series of Events')]")).click();
									driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();
									driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).sendKeys("5/9/2020");
									Thread.sleep(5000);
									driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();	
								
							}
}

							
							
					
							
				 
			 
	   
