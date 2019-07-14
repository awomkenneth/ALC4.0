package com.kendfd.testken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TestMain extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);

        getSupportActionBar().setTitle("ALC 4 Phase 1");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

    }

    public void openActivity2() {
        Intent intent = new Intent(this, AboutAlc.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }


}
