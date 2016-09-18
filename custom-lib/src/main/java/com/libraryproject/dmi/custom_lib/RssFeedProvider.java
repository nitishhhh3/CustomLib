package com.libraryproject.dmi.custom_lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dmi on 9/4/2016.
 */
public class RssFeedProvider {
    public static List<RssItem> parse(String rssFeed) {
        List<RssItem> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            RssItem item = new RssItem("Summary " + s, "Description " + s);
            list.add(item);
        }
        return list;
    }
}