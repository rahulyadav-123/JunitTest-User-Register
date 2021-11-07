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
		String actual = register.LastName("Yadav");
		Assert.assertEquals("Yadav", actual);
	}
	@Test
	public void givenEmailId_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.emailId("ry219613@gmail.com");
		Assert.assertEquals("ry219613@gmail.com", actual);
	}
	@Test
	public void givenPhoneNumber_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.phoneNumber("7385932865");
		Assert.assertEquals("7385932865", actual);
	}
	@Test
	public void givenPassword_isProper() {
		UserRegister register = new UserRegister();
		String actual = register.password("hHdfghrlw");
		Assert.assertEquals("hHdfghrlw", actual);
	}
}	
	



