package com.example.coffeeordering;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity1 = 0;
    int quantity2 = 0;
    int quantity3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String price1 = "Price for " + quantity1 + " Cups of Cappuccino is- Rs." + quantity1*255;
        String price2 = "Price for " + quantity2 + " Cups of Mocha Frappuccino is- Rs." + quantity2*330;
        String price3 = "Price for " + quantity3 + " Cups of Dark Caramel Frappuccino is- Rs." + quantity3*390;
        int total = quantity1*255 + quantity2*330 + quantity3*390;
        int totNum = quantity1 + quantity2 + quantity3;
        String priceTot = "Total price for " + totNum + " Cups of Coffee is- Rs." + total;
        displayMessage1(price1);
        displayMessage2(price2);
        displayMessage3(price3);
        displayMessage4(priceTot);

    }

    public void increment1(View view){
        quantity1 = quantity1 + 1;
        display1(quantity1);
    }

    public void decrement1(View view){
        if(quantity1<1){
            quantity1 = 0;
        }
        else {
            quantity1 = quantity1 - 1;
            display1(quantity1);
        }
    }

    public void increment2(View view){
        quantity2 = quantity2 + 1;
        display2(quantity2);
    }

    public void decrement2(View view){
        if(quantity2<1){
            quantity2 = 0;
        }
        else {
            quantity2 = quantity2 - 1;
            display2(quantity2);
        }
    }

    public void increment3(View view){
        quantity3 = quantity3 + 1;
        display3(quantity3);
    }

    public void decrement3(View view){
        if(quantity3<1){
            quantity3 = 0;
        }
        else {
            quantity3 = quantity3 - 1;
            display3(quantity3);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view1);
        quantityTextView.setText("" + number);
    }

    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view2);
        quantityTextView.setText("" + number);
    }

    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view3);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    //private void displayPrice(int number) {
    //  TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
    // priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    //}

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage1(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view1);
        priceTextView.setText(message);
    }

    private void displayMessage2(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view2);
        priceTextView.setText(message);
    }

    private void displayMessage3(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view3);
        priceTextView.setText(message);
    }

    private void displayMessage4(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view4);
        priceTextView.setText(message);
    }
}