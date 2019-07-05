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

public class LeftRecycleViewAdapter extends RecyclerView.Adapter<LeftRecycleViewAdapter.ViewHolder> {

    private List<String> listData;

    public LeftRecycleViewAdapter(List<String> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_left, parent, false);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNo.setText(listData.get(position));
        holder.tvTitle.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNo, tvTitle;

        ViewHolder(final View itemView) {
            super(itemView);
            tvNo = itemView.findViewById(R.id.tvNo);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }
}
