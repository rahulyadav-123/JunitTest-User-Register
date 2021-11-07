package com.labz.test;

import org.junit.Assert;

import org.junit.Test;

public class SampleEmailTest {
	SampleEmail testmail = new SampleEmail();

    @Test
    public void givenEmailId1_IsProper() {
        String actualResult = testmail.testForValidEmails("abc@yahoo.com");
        Assert.assertEquals("abc@yahoo.com", actualResult);
    }

    @Test
    public void givenEmailId2_IsProper() {
        String actualResult = testmail.testForValidEmails("abc-100@yahoo.com");
        Assert.assertEquals("abc-100@yahoo.com", actualResult);
    }

    @Test
    public void givenEmailId3_IsProper() {
        String actualResult = testmail.testForValidEmails("abc.100@yahoo.com");
        Assert.assertEquals("abc.100@yahoo.com", actualResult);
    }

    @Test
    public void givenEmailId4_IsProper() {
        String actualResult = testmail.testForValidEmails("abc111@abc.com");
        Assert.assertEquals("abc111@abc.com", actualResult);
    }

    @Test
    public void givenEmailId5_IsProper() {
        String actualResult = testmail.testForValidEmails("abc-100@abc.net");
        Assert.assertEquals("abc-100@abc.net", actualResult);
    }

    @Test
    public void givenEmailId6_IsProper() {
        String actualResult = testmail.testForValidEmails("abc.100@abc.com.au");
        Assert.assertEquals("abc.100@abc.com.au", actualResult);
    }

    @Test
    public void givenEmailId7_IsProper() {
        String actualResult = testmail.testForValidEmails("abc@1.com");
        Assert.assertEquals("abc@1.com", actualResult);
    }

    @Test
    public void givenEmailId8_IsProper() {
        String actualResult = testmail.testForValidEmails("abc@gmail.com.com");
        Assert.assertEquals("abc@gmail.com.com", actualResult);
    }

    @Test
    public void givenEmailId9_IsProper() {
        String actualResult = testmail.testForValidEmails("abc+100@gmail.com");
        Assert.assertEquals("abc+100@gmail.com", actualResult);
    }

    @Test
    public void givenEmilId1_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc");
        Assert.assertEquals("abc", actualResult);
    }
    
    @Test
    public void givenEmilId2_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc@.com.my");
        Assert.assertEquals("abc@.com.my", actualResult);
    }
   
    @Test
    public void givenEmilId3_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc123@gmail.a");
        Assert.assertEquals("abc123@gmail.a", actualResult);
    }
    
    @Test
    public void givenEmilId4_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc123@.com");
        Assert.assertEquals("abc123@.com", actualResult);
    }
    @Test
    public void givenEmilId5_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc123@.com.com");
        Assert.assertEquals("abc123@.com.com", actualResult);
    }
    
    @Test
    public void givenEmilIds6_IsNotProper() {
        String actualResult = testmail.testForValidEmails(".abc@abc.com");
        Assert.assertEquals(".abc@abc.com", actualResult);
    }
    
    @Test
    public void givenEmilId7_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc()*@gmail.com");
        Assert.assertEquals("abc()*@gmail.com", actualResult);
    }
    
    @Test
    public void givenEmilId8_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc@%*.com");
        Assert.assertEquals("abc@%*.com", actualResult);
    }
    
    @Test
    public void givenEmilId9_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc..2002@gmail.com");
        Assert.assertEquals("abc..2002@gmail.com", actualResult);
    }
    
    @Test
    public void givenEmilId10_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc.@gmail.com");
        Assert.assertEquals("abc.@gmail.com", actualResult);
    }
    
    @Test
    public void givenEmilId11_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc@abc@gmail.com");
        Assert.assertEquals("abc@abc@gmail.com", actualResult);
    }
    
    @Test
    public void givenEmilId12_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc@gmail.com.1a");
        Assert.assertEquals("abc@gmail.com.1a", actualResult);
    }
    
    @Test
    public void givenEmilId13_IsNotProper() {
        String actualResult = testmail.testForValidEmails("abc@gmail.com.aa.au");
        Assert.assertEquals("abc@gmail.com.aa.au", actualResult);
    }

}
