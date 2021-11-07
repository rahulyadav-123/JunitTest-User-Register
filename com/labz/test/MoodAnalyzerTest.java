package com.labz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.test.MoodAnalyzer;

public class MoodAnalyzerTest {
	
	MoodAnalyzer mood = new MoodAnalyzer();

	@Test
	public void givenMessage_WhenHappy_ReturnEntrySuccesfull() {
		String actualResult = mood.analyseMood("User is Happy");
	    Assert.assertEquals("Entry Successful", actualResult);
	    }

	 @Test
	 public void givenMessage_WhenSad_ReturnEntryFail() {
	        String actualResult = mood.analyseMood("User is Sad");
	        Assert.assertEquals("Entry Failed", actualResult);
	    }
}
	
