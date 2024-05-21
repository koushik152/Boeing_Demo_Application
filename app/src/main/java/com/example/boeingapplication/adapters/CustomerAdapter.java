package com.example.boeingapplication.adapters;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boeingapplication.R;
import com.example.boeingapplication.main_activitys.Select_Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.UserViewHolder> {

    private Context context;
    private List<String> userList;
    private int selectedPosition = -1;
    private List<String> userListFull; // For search filtering
    private OnUserClickListener onUserClickListener;



    public interface OnUserClickListener {
        void onItemClick(String user, int position);
    }



    public CustomerAdapter(Context context, List<String> userList, OnUserClickListener onUserClickListener) {
        this.context = context;
        this.userList = userList;
        this.userListFull = new ArrayList<>(userList); // Initialize the full list
        this.onUserClickListener = onUserClickListener;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        String user = userList.get(position);
        holder.textViewUser.setText(user);
        // Show/hide the right mark based on selection
        if (position == selectedPosition) {
            holder.imageViewRightMark.setVisibility(View.VISIBLE);
        } else {
            holder.imageViewRightMark.setVisibility(View.GONE);
        }

        holder.itemView.setOnClickListener(v -> {
            // Update the selected position
            selectedPosition = holder.getAdapterPosition();
            notifyDataSetChanged();
            if(onUserClickListener !=null)// Notify adapter to refresh the views
           onUserClickListener.onItemClick(user, holder.getAdapterPosition());
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public void filter(String text) {
        userList.clear();
        if (text.isEmpty()) {
            userList.addAll(userListFull);
        } else {
            text = text.toLowerCase();
            for (String user : userListFull) {
                if (user.toLowerCase().contains(text)) {
                    userList.add(user);
                }
            }
        }
        notifyDataSetChanged();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        public View imageViewRightMark;
        TextView textViewUser;

        UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewUser = itemView.findViewById(R.id.textViewUser);
            imageViewRightMark = itemView.findViewById(R.id.imageViewRightMark);
        }
    }
}