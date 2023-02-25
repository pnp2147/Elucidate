import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search {
    String word;
    ArrayList<Entry> entryList;
    ArrayList<Entry> resultList;

    public void Search(String word) {
        this.word = word;
        /**
         * Pull from the database all the entries
         */
    }

    public ArrayList<Entry> filterByLucidity(boolean lucidity) {
        for (Entry entry : entryList) {
            if (entry.isLucidity()) {
                resultList.add(entry);
            }
        }
        return resultList;
    }
}
