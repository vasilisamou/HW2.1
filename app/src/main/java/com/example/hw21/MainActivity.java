package com.example.hw21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText  editText_read = findViewById(R.id.editText_read );
        EditText  editText_write = findViewById(R.id.editText_write );
        Button btn = findViewById(R.id.button );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String text = editText_read.getText().toString();


               editText_write.setText(text.toUpperCase() );

            }
        });
    }
}