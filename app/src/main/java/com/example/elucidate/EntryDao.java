package com.example.elucidate;

import androidx.room.*;

import com.example.elucidate.ui.Entry;

import java.util.*;

@Dao
public interface EntryDao {
    @Query("SELECT * FROM entry")
    List<Entity> getAll();

    @Query("SELECT * FROM entry WHERE name LIKE (:textSearch)")
    List<Entity> findByName(String textSearch);

    @Insert
    void insertAll(Entry... entries);

    @Delete
    void delete(Entry entry);
}