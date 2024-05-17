package com.example.boeingapplication.adapters;


import static androidx.core.content.ContextCompat.startActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boeingapplication.R;
import com.example.boeingapplication.main_activitys.Create_Account_Activity;
import com.example.boeingapplication.main_activitys.Dialog_change_password;
import com.example.boeingapplication.model.SettingItem;

import java.util.List;

public class SettingAdapter extends RecyclerView.Adapter<SettingAdapter.SettingViewHolder>{

    private List<SettingItem> settingItems;
    private Context context;

    public static class SettingViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        ImageView imageView1;

        public SettingViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView1);
            imageView1= itemView.findViewById(R.id.imageView1);
        }
    }
    public SettingAdapter(Context context,List<SettingItem> settingItems){
        this.context = context;
        this.settingItems = settingItems;
    }

    @NonNull
    @Override
    public SettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_setting, parent, false);
        return new SettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SettingViewHolder holder, int position) {
        SettingItem settingItem = settingItems.get(position);
        holder.imageView.setImageResource(settingItem.getImageView());
        holder.textView.setText(settingItem.gettext());
        holder.imageView1.setImageResource(settingItem.getImageView1());
        // Add OnClickListener for the first item
        if (position == 0) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open the new activity here
                    Intent intent = new Intent(context, Dialog_change_password.class);
                   context.startActivity(intent);
                }
            });

        }
        if (position == 2) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open the new activity here
                    showCustomDialog();
                }


            });

        }
    }



    @Override
    public int getItemCount() {
        return settingItems.size();
    }

    private void showCustomDialog() {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_custom);
        Button searchButton = dialog.findViewById(R.id.searchButton);
        // Set up search button click listener if needed
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle search button click here
            }
        });
        dialog.show();

    }
}
