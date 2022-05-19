package com.example.toppage2.ui.top;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.toppage2.InventoryActivity;
import com.example.toppage2.R;
import com.example.toppage2.databinding.FragmentTopBinding;
import com.example.toppage2.ui.inventory.InventoryFragment;

public class TopFragment extends Fragment {

    private FragmentTopBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TopViewModel topViewModel =
                new ViewModelProvider(this).get(TopViewModel.class);

        binding = FragmentTopBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        ImageButton ToInventory = view.findViewById(R.id.inventoryButton1);
        ToInventory.setOnClickListener(new MyOnClickListener());


        final TextView textView = binding.textTop;
        topViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }

    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            Intent intent = new Intent(getActivity().getApplication(), InventoryActivity.class);
            startActivity(intent);
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}