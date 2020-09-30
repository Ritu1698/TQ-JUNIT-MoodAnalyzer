package com.dummytesting;

public class MoodAnalyzer {


    public String analyzeMood(String message) throws MoodAnalysisException{

        try {

            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Enter non-empty Mood") ;

            else if(message.contains(("Sad")))
                return "SAD";

            else
                return "HAPPY";
        }
        catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Enter proper Mood");
        }



    }
}
