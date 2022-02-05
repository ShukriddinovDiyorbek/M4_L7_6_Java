package uz.pdp.layoutadvancedjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        TextView textView = findViewById(R.id.textView);
        String text = "I would like to do something similar to the https://twitter.com app";

        Spannable spannable = new SpannableString(text);
        spannable.setSpan(new ForegroundColorSpan(Color.BLUE), 44, 62, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannable);
    }
}