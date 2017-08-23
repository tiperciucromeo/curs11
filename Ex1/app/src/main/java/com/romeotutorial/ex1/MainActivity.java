package com.romeotutorial.ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements HeadlineFragment.OnHeadlineClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void headlineSelected(String headline) {
        ArticleFragment articleFragment =(ArticleFragment) getFragmentManager().findFragmentById(R.id.article_frag);
        if(articleFragment == null){
            Intent intent = new Intent(this,ArticleActivity.class);
            intent.putExtra("Headline",headline);
            startActivity(intent);
        }else{
                articleFragment.updateInfo(headline);
        }

    }
}
