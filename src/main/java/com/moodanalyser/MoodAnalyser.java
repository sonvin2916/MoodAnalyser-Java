package com.moodanalyser;

import com.moodanalyser.com.moodanalyser.MoodAnalysisException;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser()
    {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalysisException("Please enter a proper message");
        }
    }
}