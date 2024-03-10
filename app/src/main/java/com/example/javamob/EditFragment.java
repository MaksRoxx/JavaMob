package com.example.javamob;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EditFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_edit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditViewModel mViewModel = new ViewModelProvider(requireActivity()).get(EditViewModel.class);

        view.findViewById(R.id.plusButton).setOnClickListener(v -> mViewModel.incrementCount());
        view.findViewById(R.id.minusButton).setOnClickListener(v -> mViewModel.decrementCount());
    }
}