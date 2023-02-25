import java.lang.reflect.Array;
import java.util.ArrayList;

public class Statistics {
    ArrayList<Entry> totalEntries;
    static float avgQuality;
    static float avgClarity;

    public void calcQualityAvg(){
        float totalQualityScore = 0;
        for(Entry entry:totalEntries){
            totalQualityScore+=entry.getQuality();
        }
        avgQuality = totalQualityScore/totalEntries.size();
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
}
