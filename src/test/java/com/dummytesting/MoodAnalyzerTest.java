package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {



    @Test
    public  void givenMessage_WhenSad_ShouldReturnSad() throws Exception{

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public  void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
        String mood1 = moodAnalyzer.analyzeMood("This is a Any Message");
        Assert.assertEquals("HAPPY", mood1);
    }
    @Test
    public  void givenMessage_WhenNull_ShouldReturnCustomMessage() throws MoodAnalysisException{

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        try {
            String mood = moodAnalyzer.analyzeMood(null);
            Assert.assertEquals("HAPPY", mood);
        }
        catch (MoodAnalysisException e) {

            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.e);
            Assert.assertEquals("Enter proper Mood",e.getMessage());
        }

    }

    @Test
    public void givenMessage_WhenEmpty_ShouldReturnCustomMessage() throws MoodAnalysisException
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        try {
            String mood = moodAnalyzer.analyzeMood("");
            Assert.assertEquals("HAPPY", mood);
        }
        catch (MoodAnalysisException e)
        {

            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.e);
            Assert.assertEquals("Enter non-empty Mood",e.getMessage());
        }
    }


}
