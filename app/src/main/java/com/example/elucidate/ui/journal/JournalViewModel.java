package com.example.elucidate.ui.journal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JournalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public JournalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Your dreams");
    }

    public LiveData<String> getText() {
        return mText;
    }
}