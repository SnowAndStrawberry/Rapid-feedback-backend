package com.RapidFeedback;

import java.util.ArrayList;

/**
 * description: a class that stores information from Field table in database
 */
public class Field {


    private int id;
    private String name;
    private ArrayList<Comment> commentList = new ArrayList<Comment>();


    public Field (int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(ArrayList<Comment> commentList) {
        this.commentList = commentList;
    }

}
