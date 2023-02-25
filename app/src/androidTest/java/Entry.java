import java.time.LocalDateTime;
import java.time.LocalTime;

public class Entry {
    String note;
    LocalDateTime timestamp;
    LocalTime timeOfSleep;
    int quality;
    int clarity;
    boolean lucidity;
    public enum Mood{
        NIGHTMARE,
        SAD,
        NEUTRAL,
        HAPPY,
        ECSTATIC
    }
    Mood entryMood;

    public Entry(String note, int quality, int clarity, boolean lucidity, Mood currentMood) {
        this.note = note;
        this.timestamp = LocalDateTime.now();
        this.timeOfSleep = LocalTime.now();
        this.quality = quality;
        this.clarity = clarity;
        this.lucidity = lucidity;
        this.entryMood = currentMood;
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

    public boolean isLucid() {
        return lucidity;
    }

    public Mood getEntryMood(){
        return entryMood;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setClarity(int clarity) {
        this.clarity = clarity;
    }

    public void setLucidity(boolean lucidity) {
        this.lucidity = lucidity;
    }

    public void setEntryMood(Mood entryMood) {
        this.entryMood = entryMood;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "\n\tnote='" + note + '\'' +
                ",\n\ttimestamp=" + timestamp +
                ",\n\ttimeOfSleep=" + timeOfSleep +
                ",\n\tquality=" + quality +
                ",\n\tclarity=" + clarity +
                ",\n\tLucidity=" + lucidity +
                ",\n\tentryMood=" + entryMood +
                "\n}";
    }

}
