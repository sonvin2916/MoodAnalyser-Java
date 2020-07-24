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
<<<<<<< HEAD
            if (message.contains("SAD")) {
=======
            if (message.length()==0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Enter a proper message");
            }
            if(message.contains("Sad"))
>>>>>>> UC3-throwCustomException
                return "SAD";
            } else {
                return "HAPPY";
<<<<<<< HEAD
            }
        }catch (NullPointerException e){
            throw new MoodAnalysisException("Please enter a proper message");
        }
    }
}
=======
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Enter a proper message");
        }
    }
}
>>>>>>> UC3-throwCustomException
