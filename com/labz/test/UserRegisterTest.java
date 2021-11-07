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
	
	@Test
	public void givenLastName_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.lastName("Kulal");
		Assert.assertEquals("Kulal", actual);
	}
	
	@Test
	public void givenEmailId_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.emailId("brijeshkulal534@gmail.com");
		Assert.assertEquals("brijeshkulal534@gmail.com", actual);
	}
	
	@Test
	public void givenPhoneNumber_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.phoneNumber("8289830020");
		Assert.assertEquals("8289830020", actual);
	}
	
	@Test
	public void givenPassword_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.password("vAvc3@ttaay");
		Assert.assertEquals("vAvc3@ttaay", actual);
	}
}


