package com.example.albertsnewsapp;

import android.content.Context;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import android.content.AsyncTaskLoader;
import android.util.Log;


public class NewsLoader extends AsyncTaskLoader<List<News>> {

    public NewsLoader(Context context) {
        super(context);
    }

        @Override
        protected void onStartLoading () {
            super.onStartLoading();
            forceLoad();
        }

        @Override
        public List<News> loadInBackground () {
            List<News> listOfNews = null;
            try {
                URL url = QueryUtils.createUrl();
                String jsonResponse = QueryUtils.makeHttpRequest(url);
                listOfNews = QueryUtils.parseJson(jsonResponse);
            } catch (IOException e) {
                Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
            }
            return listOfNews;
        }
    }
