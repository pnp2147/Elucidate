import java.time.LocalDateTime;
import java.time.LocalTime;

public class Entry {
    String note;
    LocalDateTime timestamp;
    LocalTime timeOfSleep;
    int quality;
    int clarity;
    boolean Lucidity;
    Mood thisMood;

    public Entry(String note, int quality, int clarity, boolean lucidity, Mo) {
        this.note = note;
        this.timestamp = LocalDateTime.now();
        this.timeOfSleep = LocalTime.now();
        this.quality = quality;
        this.clarity = clarity;
        Lucidity = lucidity;
    }

    public void publish(){
        /**
         * publishes each entry in the database
         */
    }

    public void edit(String newNote){
        /**
         * Edit the entry
         */
        this.note = newNote;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public LocalTime getTimeOfSleep() {
        return timeOfSleep;
    }

    public int getQuality() {
        return quality;
    }

    public int getClarity() {
        return clarity;
    }

    public boolean isLucidity() {
        return Lucidity;
    }
}
