package com.bridgelabz.test;

public class MoodAnalyzer {
	
	public String analyseMood(String message) {
		if(message.contains("Happy")) {
		return "Entry Successful";
		}
		else {
			return "Entry Failed";
		}
	}
}

