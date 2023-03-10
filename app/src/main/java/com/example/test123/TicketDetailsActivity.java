package com.example.test123;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class TicketDetailsActivity extends AppCompatActivity {
    TextView ticketType;
    TextView ticketPrice;

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DELETE HEADER
        double price = getIntent().getDoubleExtra("price", 0);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        setContentView(R.layout.ticket_time_details);
        TextView header_title = findViewById(R.id.header_title);
        header_title.setText("Kup bilet");
        ticketType = findViewById(R.id.ticket_type);
        ticketPrice = findViewById(R.id.ticket_price);
        ticketType.setText(getIntent().getStringExtra("ticketType"));
        ticketPrice.setText(String.format("%.2f", price) + " zł");
        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(view -> finish());
        TextWatcher cWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 0) {
                    ticketPrice.setText(String.format("%.2f", price) + " zł");
                } else {
                    ticketPrice.setText(String.format("%.2f", price * Double.parseDouble(s.toString())) + " zł");
                }
            }
        };
        TextView count = findViewById(R.id.Tickets_amount);
        count.addTextChangedListener(cWatcher);
        Button buy = findViewById(R.id.buy_ticket_button);
        buy.setOnClickListener(v -> {
            DBHandler db = new DBHandler(this);
            if (count.getText().toString().equals("") || count.getText().toString().equals("0")) {
                Toast.makeText(this, "Podaj ilość biletów", Toast.LENGTH_SHORT).show();
            }
            db.buyTicket(getIntent().getStringExtra("ticketType"), Float.parseFloat(ticketPrice.getText().toString().substring(0, ticketPrice.getText().toString().length() - 3)), Integer.parseInt(count.getText().toString()), 0, getIntent().getIntExtra("time", 0));
            finish();
        });
    }
}
