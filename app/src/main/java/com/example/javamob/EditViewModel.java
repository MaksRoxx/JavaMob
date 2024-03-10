package com.example.javamob;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class EditViewModel extends ViewModel {
    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public LiveData<Integer> getCount() {
        return count;
    }

    public void incrementCount() {
        Integer updatedCount = count.getValue();
        if (updatedCount == null) updatedCount = 0;
        updatedCount++;
        count.setValue(updatedCount);
    }

    public void decrementCount() {
        Integer updatedCount = count.getValue();
        if (updatedCount == null) updatedCount = 0;
        updatedCount--;
        count.setValue(updatedCount);
    }
}