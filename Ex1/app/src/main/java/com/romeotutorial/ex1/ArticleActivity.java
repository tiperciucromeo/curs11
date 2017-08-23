package com.romeotutorial.ex1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ArticleActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_activity_layout);
        String Heading;
        Intent intent = getIntent();
        Heading = intent.getStringExtra("Headline");
        ArticleFragment articleFragment =(ArticleFragment) getFragmentManager().findFragmentById(R.id.article_frag);
        articleFragment.updateInfo(Heading);

    }
}
