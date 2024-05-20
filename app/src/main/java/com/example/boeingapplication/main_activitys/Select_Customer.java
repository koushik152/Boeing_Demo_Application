package com.example.boeingapplication;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boeingapplication.adapters.CustomerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Select_Customer  {
    public static void initRecyclerView(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        List<String> users = getUserList();
        CustomerAdapter adapter = new CustomerAdapter(context, users, new CustomerAdapter.OnUserClickListener() {
            @Override
            public void onUserClick(String user, int position) {
                // Handle user click
            }
        });
        recyclerView.setAdapter(adapter);
    }

    private static List<String> getUserList() {
        List<String> users = new ArrayList<>();
        users.add("User 1");
        users.add("User 2");
        // Add more users if needed
        return users;
    }
}




