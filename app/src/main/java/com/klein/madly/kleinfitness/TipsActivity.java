package com.klein.madly.kleinfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

import com.zephgv.mad.beastfitness.R;

public class TipsActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        webView = findViewById(R.id.webview2);
        webView.loadUrl("https://www.self.com/story/popular-at-home-workout-programs");

    }
}