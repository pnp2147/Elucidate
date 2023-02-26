import androidx.room.*;

import com.example.elucidate.ui.Entry;

@Database(entities = {Entry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract EntryDao entryDao();
}
