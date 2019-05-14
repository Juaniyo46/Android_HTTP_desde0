package com.example.ejer_http_json;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Posts {

    private ArrayList<Post> postsList;

    public Posts(){
        this.postsList = new ArrayList<>();
    }

    public ArrayList<Post> getPostsList(){
        return  postsList;
    }

    public Posts fromJSON(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Posts.class);
    }
}
