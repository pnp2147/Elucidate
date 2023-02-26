package com.example.elucidate.ui;

import com.example.elucidate.EntryDao;

import java.util.*;

/**
 * This class will no longer be needed as we're using SQL database now
 */
public class Search {
    String word;
    ArrayList<Entry> entryList;
    ArrayList<Entry> resultList;
    Entry.Mood thisMood;
    EntryDao entryDao;

    public void Search(String word) {
        this.word = word;
        /**
         * Pull from the database all the entries
         */
    }

    public ArrayList<Entry> filterByLucidity(boolean lucidity) {
        for (Entry entry : entryList) {
            if (entry.isLucid()) {
                resultList.add(entry);
            }
        }
        return resultList;
    }

    public ArrayList<Entry> filterbyClarity(int clarity) {
        for (Entry entry : entryList) {
            if (entry.getClarity() == clarity) {
                resultList.add(entry);
            }
        }
        return resultList;
    }
    public ArrayList<Entry> filterByMood(Entry.Mood moodFilter){
        for (Entry entry : entryList) {
            if (entry.getEntryMood().equals(moodFilter)) {
                resultList.add(entry);
            }
        }
        return resultList;
    }
}
