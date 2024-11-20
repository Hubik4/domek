package com.example.domek;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likeCount = 0;
    private TextView likeCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja widoków
        likeCountTextView = findViewById(R.id.likeCount);
        Button likeButton = findViewById(R.id.likeButton);
        Button dislikeButton = findViewById(R.id.dislikeButton);

        // Obsługa przycisku POLUB
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++;
                updateLikeCount();
            }
        });

        // Obsługa przycisku USUŃ
        dislikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeCount > 0) {
                    likeCount--;
                }
                updateLikeCount();
            }
        });
    }

    // Aktualizacja tekstu liczby polubień
    private void updateLikeCount() {
        likeCountTextView.setText(likeCount + " polubień");
    }
}
