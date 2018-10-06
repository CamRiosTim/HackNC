package com.example.android.myfirst;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.EditText;

public class AppActivity extends Activity {

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
        final EditText ed1 = findViewById(R.id.usernameTextBox);
        final EditText ed2 = findViewById(R.id.passTextBox);

        button.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick (View view) {
                    if (ed1.getText().toString().equals("admin") &&
                            ed2.getText().toString().equals("admin"))

                    {
                        button.setText("Processing...");
                        Intent intent = new Intent(context, App2Activity.class);
                        startActivity(intent);
                    }
                    else{
                        button.setText("Log in failed!");
                    }
                }


        });
    }
}
