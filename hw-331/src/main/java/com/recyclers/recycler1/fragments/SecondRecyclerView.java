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
import com.recyclers.recycler1.adapters.LettersAdapter;

import java.util.ArrayList;


public class SecondRecyclerView extends Fragment {

    private RecyclerView recyclerLetters;
    private ArrayList <String> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerLetters = view.findViewById(R.id.letters_container);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");
        list.add("M");
        list.add("N");
        list.add("O");
        list.add("P");
        list.add("Q");
        list.add("R");
        list.add("S");
        list.add("T");
        list.add("U");
        list.add("V");
        list.add("W");
        list.add("X");
        list.add("Y");
        list.add("Z");

        LettersAdapter adapter = new LettersAdapter(list);
        recyclerLetters.setAdapter(adapter);
    }
}