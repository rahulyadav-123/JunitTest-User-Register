package com.bridgelabz.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmail {
	public String testForValidEmails(String SampleEmail) {
        Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
        Matcher match = pattern.matcher(SampleEmail);
        if(match.matches())
       {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
		return SampleEmail;
	}

}
