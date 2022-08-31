package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;

@Test(groups = { "PIMPage" }, dependsOnGroups = { "HomePage" })
public class PIMPageTest extends BaseClass{
	

		protected PIMPage pimpage;
		protected String empid;

		@Test(priority = 1)
		public void validatePIMNewEmployee() {
			pimpage = new PIMPage();
			empid = pimpage.addNewEmployeeInPIMPage("abc", "PQR", "xyz");
		}

		@Test(priority = 2)
		public void validatePersonalDetailsInPIMPage() {
			pimpage.clickOnEditbuttonPersonalDetailsInPIMPage();
			pimpage.enterDataInLicenN("123456778");
			pimpage.enterDataInSsNNumber("9999999999");

		}

		@Test(priority = 3)
		public void validateDrivingLicenseDate() {
			pimpage.clickOnLicenseExpdate();
			String selectYear = pimpage.selectlicenseExpYear("2023");
			Assert.assertEquals(selectYear, "2023");

			String selectmonth = pimpage.selectlicenseExpMonth("Nov");
			Assert.assertEquals(selectmonth, "Nov");

			pimpage.selectLicenseExpDate();

		}

		@Test(priority = 4)
		public void validateCountryDropDown() {
			String actualSelectedValue = pimpage.handleCountryDropDown("Indian");

			Assert.assertEquals(actualSelectedValue, "Indian");
		}

		@Test(priority = 5)
		public void validateMaritalStatusDropDown() {
			String actualSelectedValuemarital = pimpage.handleMaritalstatusInPIMPage("Single");

			Assert.assertEquals(actualSelectedValuemarital, "Single");
		}

		
		@Test(priority = 6)
		public void validateDobDates()
		{
			pimpage.clickOnDob();
			String year =pimpage.selectDobyear("2000");
			Assert.assertEquals(year, "2000");
			
			String month=pimpage.selectDobmonth("Dec");
			Assert.assertEquals(month, "Dec");
			
			pimpage.clickOnDobDate();
			
		}

	}
