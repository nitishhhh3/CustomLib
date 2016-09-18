package com.libraryproject.dmi.customlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.libraryproject.dmi.custom_lib.RssFeedProvider;
import com.libraryproject.dmi.custom_lib.RssItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textView);

        Button fab = (Button) findViewById(R.id.button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDetail();

            }
        });
    }

    public void updateDetail() {  //
        List<RssItem> list = RssFeedProvider
                .parse("http://www.vogella.com/article.rss");
        String text = String.valueOf(list.toString());
        textview.setText("GOT::" + text);

    }


}
