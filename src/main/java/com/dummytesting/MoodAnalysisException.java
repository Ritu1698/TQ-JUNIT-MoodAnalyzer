package com.dummytesting;

public class MoodAnalysisException extends Exception{

    ExceptionType e;

    enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY;
    }

    public MoodAnalysisException(ExceptionType e,String message) {
        super(message);
        this.e = e;
    }
}
