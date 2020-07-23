package com.moodanalyser;

import com.moodanalyser.com.moodanalyser.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysisException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMoodAgain("I am in Happy Mood");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_ShouldReturnHappy() throws MoodAnalysisException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_ShouldThrowException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMoodAgain();
            Assert.assertEquals("HAPPY",mood);
        }
        catch(MoodAnalysisException e)
        {
            e.printStackTrace();
            
        }

    }
}

