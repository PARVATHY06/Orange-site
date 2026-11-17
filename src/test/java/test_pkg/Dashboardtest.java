package test_pkg;

import org.testng.annotations.Test;

import base_pkg.Baseclass;

public class Dashboardtest extends Baseclass
{
	@Test(priority=1)
	public void dash()
	{
		dashobj.VerifyDashboardmthd();
	}
	
	@Test(priority=2)
	public void admin()
	{
		dashobj.clickAdmin();
	}
	
	@Test(priority=3)
	public void detailmthd() throws Exception
	{
		dashobj.details();
	}
	
	@Test(priority=4)
	public void logoutmthd()
	{
		dashobj.logout();
	}

}
