package com.example.javamob;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_count, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditViewModel mViewModel = new ViewModelProvider(requireActivity()).get(EditViewModel.class);

        final Observer<Integer> countObserver = integer -> {
            TextView tv = view.findViewById(R.id.tv);
            tv.setText(String.valueOf(integer));
        };

        mViewModel.getCount().observe(getViewLifecycleOwner(), countObserver);
    }
}