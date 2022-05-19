package com.example.toppage2.ui.inventory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventoryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InventoryViewModel(MutableLiveData<String> mText) {
        this.mText = mText;
        mText.setValue("This is Inventory fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}