package com.example.toppage2.ui.qr;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QrViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public QrViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is QRshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}