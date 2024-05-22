package com.example.boeingapplication.main_activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.boeingapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Dialogchangepassword extends AppCompatActivity {
BottomNavigationView bnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dialog_change_password);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );


        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.custom_back);
        toolbar.getChildAt(1).setTranslationY(30);
        toolbar.setPadding(0, 0, 0, 10);

        bnView = findViewById(R.id.bnView);
        bnView.setSelectedItemId(R.id.setting);
        bnView.setLabelVisibilityMode(NavigationBarView.LABEL_VISIBILITY_LABELED);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                int currentSelectedItemId = bnView.getSelectedItemId();


                Intent intent;
                int id = item.getItemId();

                if (id == R.id.chemical) {
                    // Start the MenuActivity
                    intent = new Intent(getApplicationContext(), ChemicalActivity.class);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.slide_out_right);
                    return true;
                } else if (id == R.id.bin) {
                    intent = new Intent(getApplicationContext(), BinActivity.class);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.slide_out_right);
                    return true;
                } else if (id==R.id.setting) {
                    intent = new Intent(getApplicationContext(), SettingsActivity.class);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.slide_out_right);
                    return true;
                }
                else{
                    intent = new Intent(getApplicationContext(), KitActivity.class);
                    startActivity(intent);
                    overridePendingTransition(android.R.anim.slide_out_right);
                    return true;
                }


            }

            private void overridePendingTransition(int slideOutRight) {
            }


        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle back button press
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    }
