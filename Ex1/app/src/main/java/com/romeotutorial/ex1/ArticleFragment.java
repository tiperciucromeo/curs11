package com.romeotutorial.ex1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by romeotiperciuc on 23/08/2017.
 */

public class ArticleFragment extends Fragment {
    TextView head_text;
    TextView desc_text;
    String[] article;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.article_fragment_layout, container, false);
        head_text = (TextView)view.findViewById(R.id.heading_text_id);
        desc_text = (TextView)view.findViewById(R.id.desc_id);
        return view;
    }
    public void updateInfo(String Headline)
    {
        article = getResources().getStringArray(R.array.news_contents);
        if(Headline.equals("Romania")){
            head_text.setText("Bucuresti");
            desc_text.setText(article[0]);
        }
        else if(Headline.equals("Franta")){
            head_text.setText("Paris");
            desc_text.setText(article[1]);
        }
        else if(Headline.equals("Italia")){
            head_text.setText("Roma");
            desc_text.setText(article[2]);
        }
        else if(Headline.equals("Germania")){
            head_text.setText("Berlin");
            desc_text.setText(article[3]);
        }
        else if(Headline.equals("Grecia")){
            head_text.setText("Atena");
            desc_text.setText(article[4]);
        }
        else if(Headline.equals("Elvetia")){
            head_text.setText("Berna");
            desc_text.setText(article[5]);
        }
        else if(Headline.equals("Spania")){
            head_text.setText("Madrid");
            desc_text.setText(article[6]);
        }

    }
}
