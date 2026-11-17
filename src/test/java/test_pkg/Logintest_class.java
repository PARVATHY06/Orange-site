package test_pkg;

import org.testng.annotations.Test;

import base_pkg.Baseclass;

public class Logintest_class extends Baseclass
{

	@Test
	public void login()
	{
		loginobj.loginmthd();
	}
}
