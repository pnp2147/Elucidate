package com.example.elucidate.ui.newentry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.elucidate.databinding.FragmentJournalBinding;
import com.example.elucidate.databinding.FragmentNewentryBinding;
import com.example.elucidate.ui.Entry;
import com.example.elucidate.ui.journal.JournalViewModel;

import java.util.ArrayList;

public class NewEntryFragment extends Fragment {

    private FragmentNewentryBinding binding;
    private Entry newEntry;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        NewEntryViewModel newEntryViewModel =
                new ViewModelProvider(this).get(NewEntryViewModel.class);

        binding = FragmentNewentryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;

    }
}
