package com.moodanalyser;

import com.moodanalyser.com.moodanalyser.MoodAnalysisException;

public class MoodAnalyser
{
    String message;
    public MoodAnalyser()
    {

    }
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public String analyseMood(String message)
    {
        return "SAD";
    }
    public String analyseMoodAgain(String message)
    {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
    }

    public String analyseMood() throws MoodAnalysisException
    {
        try
        {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e)
        {
            return "HAPPY";

        }
    }

    public String analyseMoodAgain() throws MoodAnalysisException {
        try
        {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException("Please enter proper message");
        }
    }


}
