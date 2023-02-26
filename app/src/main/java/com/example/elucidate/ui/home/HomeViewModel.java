package com.example.elucidate.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is your journal");
    }


    public LiveData<String> getText() {
        return mText;
    }
    public void something(){
        System.out.println("fvjdhfvjdhvbckjsdbckjdsb");
    }
}