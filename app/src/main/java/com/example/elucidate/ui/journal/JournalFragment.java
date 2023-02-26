package com.example.elucidate.ui.journal;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.elucidate.R;
import com.example.elucidate.databinding.FragmentJournalBinding;
import com.example.elucidate.ui.Entry;
import com.example.elucidate.ui.newentry.NewEntryFragment;

import java.util.ArrayList;
import java.util.List;

public class JournalFragment extends Fragment {

    private FragmentJournalBinding binding;
    private Entry e;
    private List<Entry> data;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JournalViewModel journalViewModel =
                new ViewModelProvider(this).get(JournalViewModel.class);

        // Hardcoded list of entries
        data=new ArrayList<>();
        data.add(new Entry("Hello World",3,2,true, Entry.Mood.ECSTATIC));
        data.add(new Entry("Hello World 2",3,2,true, Entry.Mood.ECSTATIC));
        data.add(new Entry("Hello World 3",3,2,true, Entry.Mood.ECSTATIC));
        data.add(new Entry("Hello World 5",3,2,true, Entry.Mood.ECSTATIC));
        data.add(new Entry("Hello World 8",3,2,true, Entry.Mood.ECSTATIC));

        binding = FragmentJournalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textjournal;
        journalViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

//        binding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Fragment newFragment = new NewEntryFragment();
//                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                transaction.replace(R.id., newFragment,null);
//                transaction.addToBackStack(null);
//                transaction.commit();
//            }
//        });

        // Iterate through the list of entries and create buttons with the text
        for(Entry e : data){
            Button b = new Button(binding.scrollable.getContext());
            b.setText(e.getName());
            binding.scrollablelinear.addView(b);

        }



        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

