package com.recyclers.recycler1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.recyclers.recycler1.R;

import java.util.ArrayList;

public class LettersAdapter extends RecyclerView.Adapter<LettersAdapter.ViewHolder> {

    private ArrayList<String> letterList;

    public LettersAdapter(ArrayList<String> letterList) {
        this.letterList = letterList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_letters, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(letterList.get(position));
    }

    @Override
    public int getItemCount() {
        return letterList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvLetters;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLetters = itemView.findViewById(R.id.letters);
        }

        public void bind(String letters) {
            tvLetters.setText(letters);
        }
    }
}
