package com.example.albertsnewsapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter (Context context, List<News> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView
                    = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.title1);
        TextView author = (TextView) convertView.findViewById(R.id.name2);
        TextView date = (TextView) convertView.findViewById(R.id.date3);
        TextView Name = (TextView) convertView.findViewById(R.id.Extra4);

        News currentNews = getItem(position);
        title.setText(currentNews.getTitle());
        author.setText(currentNews.getAuthor());
        date.setText(currentNews.getDate());
        Name.setText(currentNews.getName());

        return convertView;
    }
}
