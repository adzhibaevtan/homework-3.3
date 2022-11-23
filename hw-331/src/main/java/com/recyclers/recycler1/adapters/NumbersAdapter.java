package com.recyclers.recycler1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.recyclers.recycler1.R;

import java.util.ArrayList;

public class NumbersAdapter extends RecyclerView.Adapter <NumbersAdapter.ViewHolder> {

    private ArrayList <String> numbersList;

    public NumbersAdapter(ArrayList<String> numbersList) {
        this.numbersList = numbersList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_numbers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(numbersList.get(position));
    }

    @Override
    public int getItemCount() {
        return numbersList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvNumbers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumbers = itemView.findViewById(R.id.numbers);
        }

        public void bind(String numbers) {
            tvNumbers.setText(numbers);
        }
    }
}
