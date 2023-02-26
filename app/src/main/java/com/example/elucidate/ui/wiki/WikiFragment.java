package com.example.elucidate.ui.wiki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.elucidate.databinding.FragmentWikiBinding;


public class WikiFragment extends Fragment {

    private FragmentWikiBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WikiViewModel wikiViewModel =
                new ViewModelProvider(this).get(WikiViewModel.class);


        binding = FragmentWikiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textViewWiki;
        wikiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

