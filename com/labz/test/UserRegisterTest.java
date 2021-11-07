package com.labz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.test.UserRegister;

public class UserRegisterTest {

	@Test
	public void givenFirstName_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.firstName("Brijesh");
		Assert.assertEquals("Brijesh", actual);
	}
	
	
}


