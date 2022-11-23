package com.recyclers.recycler1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.recyclers.recycler1.R;
import com.recyclers.recycler1.adapters.NumbersAdapter;

import java.util.ArrayList;


public class FirstRecyclerView extends Fragment {

    private RecyclerView recyclerNumbers;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerNumbers = view.findViewById(R.id.number_container);
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i+1));
        }

        NumbersAdapter adapter = new NumbersAdapter(list);

        recyclerNumbers.setAdapter(adapter);
    }
}