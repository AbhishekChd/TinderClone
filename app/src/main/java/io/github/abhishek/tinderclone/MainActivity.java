package io.github.abhishek.tinderclone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yuyakaido.android.cardstackview.CardStackView;

import io.github.abhishek.tinderclone.adapter.CardAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardStackView stackView = findViewById(R.id.card_stack_view);
        stackView.setAdapter(new CardAdapter());
    }
}