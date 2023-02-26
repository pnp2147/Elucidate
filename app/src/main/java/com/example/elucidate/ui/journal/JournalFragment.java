package com.example.elucidate.ui.journal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.elucidate.databinding.FragmentHomeBinding;
import com.example.elucidate.databinding.FragmentJournalBinding;

import java.util.List;

public class JournalFragment extends Fragment {

    private FragmentJournalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JournalViewModel journalViewModel =
                new ViewModelProvider(this).get(JournalViewModel.class);

        binding = FragmentJournalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textjournal;
        journalViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        for(int i=0;i<5;i++){
            Button b = new Button(binding.scrollable.getContext());
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("you have clicked "+b.toString());
                }
            });
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