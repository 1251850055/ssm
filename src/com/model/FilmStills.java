package com.model;

/*
 * filmId,filmId 对应film_info  里面的id
 * picUrl 剧照地址ַ
 * 
 */

public class FilmStills {

    private int id;
    private String filmId;
    private String picUrl;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }


}
