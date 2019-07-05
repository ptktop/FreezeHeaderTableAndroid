package com.ptktop.freezeheadertableandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ptktop.freezeheadertableandroid.R;

import java.util.List;

/*********************
 * Created by PTKTOP *
 *********************/

public class RightRecycleViewAdapter extends RecyclerView.Adapter<RightRecycleViewAdapter.ViewHolder> {

    private List<String> listData;

    public RightRecycleViewAdapter(List<String> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_right, parent, false);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvOne.setText(listData.get(position));
        holder.tvTwo.setText(listData.get(position));
        holder.tvThree.setText(listData.get(position));
        holder.tvFour.setText(listData.get(position));
        holder.tvFive.setText(listData.get(position));
        holder.tvSix.setText(listData.get(position));
        holder.tvSeven.setText(listData.get(position));
        holder.tvEight.setText(listData.get(position));
        holder.tvNine.setText(listData.get(position));
        holder.tvTen.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvOne, tvTwo, tvThree, tvFour, tvFive, tvSix, tvSeven, tvEight, tvNine, tvTen;

        ViewHolder(final View itemView) {
            super(itemView);
            tvOne = itemView.findViewById(R.id.tvOne);
            tvTwo = itemView.findViewById(R.id.tvTwo);
            tvThree = itemView.findViewById(R.id.tvThree);
            tvFour = itemView.findViewById(R.id.tvFour);
            tvFive = itemView.findViewById(R.id.tvFive);
            tvSix = itemView.findViewById(R.id.tvSix);
            tvSeven = itemView.findViewById(R.id.tvSeven);
            tvEight = itemView.findViewById(R.id.tvEight);
            tvNine = itemView.findViewById(R.id.tvNine);
            tvTen = itemView.findViewById(R.id.tvTen);
        }
    }
}
