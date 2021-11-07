package com.bridgelabz.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
	public String firstName(String firstName) {	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(firstName);
		if(match.find() && match.group().equals(firstName)) {
			System.out.println("valid FirstName");	
			}
		else {
			System.out.println("invalid FirstName");
			}
		return firstName;
        }
	public String LastName(String LastName) {	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(LastName);
		if(match.find() && match.group().equals(LastName)) {
			System.out.println("valid LastName");	
			}
		else {
			System.out.println("invalid LastName");
			}
		return LastName;
        }
	public String emailId(String emailId) {	
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
		Matcher match = pattern.matcher(emailId);
		if(match.find() && match.group().equals(emailId)) {
			System.out.println("valid Email");	
			}
		else {
			System.out.println("invalid Email");
			}
		return emailId;
        }
	public String phoneNumber(String phoneNumber) {	
		Pattern pattern = Pattern.compile("^(\\d{1,2}?)[- .]?\\d{9,10}$");
		Matcher match = pattern.matcher(phoneNumber);
		if(match.find() && match.group().equals(phoneNumber)) {
			System.out.println("valid phoneNumber");	
			}
		else {
			System.out.println("invalid phoneNumber");
			}
		return phoneNumber;
        }
	public String password(String password) {
		Pattern pattern = Pattern.compile("^[a-z](?=.*[A-z]).(?=.*[0-9]).{8,}$");
		Matcher match = pattern.matcher(password);
		if(match.find() && match.group().equals(password)) {
			System.out.println("valid password");	
			}
		else {
			System.out.println("invalid password");
			}
		return password;
	}
		
}
