package com.example.boeingapplication.main_activitys;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boeingapplication.R;
import com.example.boeingapplication.adapters.CustomerAdapter;
import com.example.boeingapplication.adapters.SettingAdapter;
import com.example.boeingapplication.decorations.BlackLineItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class Select_Customer  {
    private static CustomerAdapter adapter;




    public static void initRecyclerView(Context context, RecyclerView recyclerView, EditText searchInput,TextView done,Dialog dialog,TextView cancel) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        BlackLineItemDecoration blackLineItemDecoration = new BlackLineItemDecoration(context);
        recyclerView.addItemDecoration(blackLineItemDecoration);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });


        List<String> users = getUserList();
        adapter = new CustomerAdapter(context, users, (user, position) -> {

            Toast.makeText(context, "select customer", Toast.LENGTH_SHORT).show();
            String selectedUserText=user.toString();
            Toast.makeText(context, selectedUserText, Toast.LENGTH_SHORT).show();
            done.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Settings_Activity.updateSettingItem(user);
                    Toast.makeText(context, "done button clicked", Toast.LENGTH_SHORT).show();
dialog.cancel();
                }
            });






});


        recyclerView.setAdapter(adapter);
// Set up the search functionality

        searchInput.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.filter(s.toString());
                // Show/hide clear button based on search text
                // Handle cancel button click
                cancel.setOnClickListener(v -> dialog.dismiss());
            }

            @Override
            public void afterTextChanged(android.text.Editable s) {}
        });
    }


    private static List<String> getUserList() {
        List<String> users = new ArrayList<>();
        users.add("0010607220 - ADAMS COMMUNICATION & ENGINEER ADAMS COMM");
        users.add("0010607296 - LEONARDO SPA LEONARDO S");
        users.add("0010607784 - AIRBUS OPERATIONS GMBH AIRBUS-A");
        users.add("0010607879 - BOEING COMPANY , THE BOEING PHI ");
        users.add("0010607893 - BOEING AEROSTRUCTURES AUSTRALI BOEING AER");
        users.add("0010607223 - ADAMS COMMUNICATION & ENGINEER ADAMS COMM");
        users.add("0010607297 - LEONARDO SPA LEONARDO S");
        users.add("0010607788 - AIRBUS OPERATIONS GMBH AIRBUS-A");
        return users;
    }


}




