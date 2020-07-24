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
            if (message.length()==0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Enter a proper message");
            }
            if(message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Enter a proper message");
        }
    }
}
