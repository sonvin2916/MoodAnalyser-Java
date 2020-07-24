package com.moodanalyser.com.moodanalyser;
import com.moodanalyser.com.moodanalyser.MoodAnalysisException;

public class MoodAnalysisException extends Exception
{
<<<<<<< HEAD

    public MoodAnalysisException( String message)
    {
        super(message);
        
=======
    public enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY;
    }
    private ExceptionType type;
    public ExceptionType getType()
    {
        return type;
    }
    public MoodAnalysisException( ExceptionType type , String message)
    {
        super(message);
        this.type=type;
>>>>>>> UC3-throwCustomException
    }

}

