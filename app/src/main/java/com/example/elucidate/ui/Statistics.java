package com.example.elucidate.ui;

import java.util.ArrayList;

public class Statistics {
    ArrayList<Entry> totalEntries;
    static float avgQuality;
    static float avgClarity;
    static float percentLucidity;
    static Entry.Mood modeMood;

    public void calcQualityAvg(){
        float totalQualityScore = 0;
        for(Entry entry:totalEntries){
            totalQualityScore+=entry.getQuality();
        }
        avgQuality = totalQualityScore/totalEntries.size();
    }

    private void calcModeMood(){
        int nightmareCount = 0 ;
        int sadCount = 0;
        int ecstaticCount = 0;
        int neutralCount = 0;
        int happyCount = 0;

        for(Entry entry:totalEntries){
            if(entry.getEntryMood().equals(Entry.Mood.NIGHTMARE)){
                nightmareCount++;
            }
            else if(entry.getEntryMood().equals(Entry.Mood.SAD)){
                sadCount++;
            }
            else if(entry.getEntryMood().equals(Entry.Mood.NEUTRAL)){
                neutralCount++;
            }
            else if(entry.getEntryMood().equals(Entry.Mood.HAPPY)){
                happyCount++;
            }
            else {
                ecstaticCount++;
            }
        }
        if (nightmareCount > sadCount && nightmareCount > ecstaticCount && nightmareCount > neutralCount && nightmareCount > happyCount) {
            modeMood = Entry.Mood.NIGHTMARE;
        } else if (sadCount > ecstaticCount && sadCount > neutralCount && sadCount > happyCount) {
            modeMood = Entry.Mood.SAD;
        } else if (ecstaticCount > neutralCount && ecstaticCount > happyCount) {
            modeMood = Entry.Mood.ECSTATIC;
        } else if (neutralCount > happyCount) {
            modeMood = Entry.Mood.NEUTRAL;
        } else {
            modeMood = Entry.Mood.HAPPY;
        }
    }

    public static float getAvgQuality() {
        return avgQuality;
    }

    public static float getAvgClarity() {
        return avgClarity;
    }

    public void calClarityAvg(){
        float totalClarityScore = 0;
        for(Entry entry:totalEntries){
            totalClarityScore+=entry.getClarity();
        }
        avgClarity = totalClarityScore/totalEntries.size();
    }

    private void calPercentLucidity(){
        float lucid = 0;
        for(Entry entry:totalEntries){
            if(entry.isLucid()) {
                lucid++;
            }
        }
        percentLucidity = lucid/totalEntries.size();
    }
}
