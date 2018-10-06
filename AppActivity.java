package com.example.android.myfirst;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    /**
     * Press this button to login and advance to the
     * next page.
     */
    public void addListenerOnButton() {

        final Context context = this;

        final Button button = findViewById(R.id.login);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                button.setText("Processing...");
                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);
            }
        });
    }
}
