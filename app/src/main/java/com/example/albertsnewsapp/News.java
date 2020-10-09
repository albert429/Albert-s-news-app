
package com.example.albertsnewsapp;



public class News {

    private String mtitle;

    private String mName;

    private String mDate;

    private String mAuthor;

    private String mUrl;

    public News(String title , String name , String date , String author , String url) {
        mtitle = title;
        mName = name ;
        mDate = date;
        mAuthor = author;
        mUrl = url;
    }


    public String getTitle() {
        return mtitle;
    }


    public String getName() {
        return mName;
    }


    public String getDate() {
        return mDate;
    }

    public String getAuthor(){
        return mAuthor;
    }


    public String getUrl() {
        return mUrl;
    }
}
