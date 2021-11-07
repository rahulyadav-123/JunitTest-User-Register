package com.labz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.test.UserRegister;

public class UserRegisterTest {

	@Test
	public void givenFirstName_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.firstName("Rahul");
		Assert.assertEquals("Rahul", actual);
	}
	@Test
	public void givenLastName_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.LastName("Rahul");
		Assert.assertEquals("Rahul", actual);
	}
	@Test
	public void givenEmailId_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.emailId("ry219613@gmail.com");
		Assert.assertEquals("ry219613@gmail.com", actual);
	}

}	
	



