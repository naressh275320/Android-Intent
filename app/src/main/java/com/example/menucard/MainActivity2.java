package com.example.menucard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView receiver_msg;
    CardView send_button2;
    CardView send_button3;
    CardView send_button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        send_button2 = findViewById(R.id.card_view1);
        send_button3 = findViewById(R.id.card_view2);
        send_button4 = findViewById(R.id.card_view3);

        receiver_msg = findViewById(R.id.received_value_id);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        str = "Welcome " + str;
        receiver_msg.setText(str);

        send_button2.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), veg.class);
            startActivity(intent2);
        });

        send_button3.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), nonveg.class);
            startActivity(intent2);
        });

        send_button4.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), beverage.class);
            startActivity(intent2);
        });
    }
}