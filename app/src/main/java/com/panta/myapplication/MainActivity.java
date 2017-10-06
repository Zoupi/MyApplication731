package com.panta.myapplication;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/* Caffe maskiinen jao */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int quantity = 0;
    public void submitOrder(View view) {

        display(quantity);
        displayPrice(quantity*5);
    }

    public void increment(View view){
        quantity++;
        display(quantity);
    }
    public void decrement(View view){
        quantity--;
        if(quantity<0){
            quantity++;
        }
        display(quantity);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /*testestetstesd*/
}