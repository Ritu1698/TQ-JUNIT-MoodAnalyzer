package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public  void givenMessage_WhenSad_ShouldReturnSad() throws Exception{

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public  void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }


}
