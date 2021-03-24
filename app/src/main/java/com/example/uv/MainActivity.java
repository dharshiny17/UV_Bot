package com.example.uv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    WebView superWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        superWebView=findViewById(R.id.camview);
        superWebView.loadUrl("http://192.168.43.123:8000");
        superWebView.getSettings().setJavaScriptEnabled(true);

        superWebView.getSettings().setLoadWithOverviewMode(true);
        superWebView.getSettings().setUseWideViewPort(true);
        superWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        superWebView.setScrollbarFadingEnabled(true);

        superWebView.setWebViewClient(new WebViewClient());
        superWebView.setWebChromeClient(new WebChromeClient()
        {
            @Override
            public void onReceivedTitle(WebView view, String title)
            {
                super.onReceivedTitle(view, title);
                getSupportActionBar().setTitle(title);
            }
        });
    }
}
