package com.dummytesting;

public class MoodAnalyzer {

    public String analyzeMood(String message) {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
        finally {
            System.out.println("In Finally");
            //return "HAPPY";
        }
    }
}
