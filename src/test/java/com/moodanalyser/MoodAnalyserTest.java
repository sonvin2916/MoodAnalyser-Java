
package com.moodanalyser;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.com.moodanalyser.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void  givenAnalyseMood_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser= new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenAnalyseMood_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser= new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);

<<<<<<< HEAD
    }
    @Test
    public void givenAnalyseMood_WhenNull_ShouldThrowException() {
        MoodAnalyser moodAnalyser= new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {

            Assert.assertEquals("Please enter a proper message",e.getMessage());
=======
    }
    @Test
    public void givenAnalyseMood_WhenNull_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.getType());
        }
    }
    @Test
    public void givenAnalyseMood_WhenEpty_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try
        {
            moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.getType());
>>>>>>> UC3-throwCustomException
        }
    }
<<<<<<< HEAD
}
=======

}
>>>>>>> UC3-throwCustomException
