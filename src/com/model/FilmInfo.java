package com.model;

/*
* 影片基本信息表
* chName,影片名称
* enName，英文名称
* soundLanguage，影片语言
* fShowTime，上映日期
* filmType，影片制式
* pixLength，影片时长
* filmDirector，影片导演
* filmActor，影片演员
* onlyDescribe，影片简介
* gutdescipty，影片剧情
* country，制片国家
* pixType，影片类型
* pictrue，图片地址
*/


public class FilmInfo {
    private int id;
    private String chName;
    private String enName;
    private String soundLanguage;
    private String fShowTime;
    private String filmType;
    private String pixLength;
    private String filmDirector;
    private String filmActor;
    private String onlyDescribe;
    private String gutdescipty;
    private String country;
    private String pixType;
    private String picture;

    private FilmClassify filmClassify;
    private String pixNumber;

    private FilmStills filmStills;
    private String picurl;


    public FilmClassify getFilmClassify() {
        return filmClassify;
    }


    public void setFilmClassify(FilmClassify filmClassify) {
        this.filmClassify = filmClassify;
    }


    public FilmStills getFilmStills() {
        return filmStills;
    }


    public void setFilmStills(FilmStills filmStills) {
        this.filmStills = filmStills;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getPixNumber() {
        return pixNumber;
    }


    public void setPixNumber(String pixNumber) {
        this.pixNumber = pixNumber;
    }


    public String getPicurl() {
        return picurl;
    }


    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }


    public String getChName() {
        return chName;
    }


    public void setChName(String chName) {
        this.chName = chName;
    }


    public String getEnName() {
        return enName;
    }


    public void setEnName(String enName) {
        this.enName = enName;
    }


    public String getSoundLanguage() {
        return soundLanguage;
    }


    public void setSoundLanguage(String soundLanguage) {
        this.soundLanguage = soundLanguage;
    }


    public String getfShowTime() {
        return fShowTime;
    }


    public void setfShowTime(String fShowTime) {
        this.fShowTime = fShowTime;
    }


    public String getFilmType() {
        return filmType;
    }


    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }


    public String getPixLength() {
        return pixLength;
    }


    public void setPixLength(String pixLength) {
        this.pixLength = pixLength;
    }


    public String getFilmDirector() {
        return filmDirector;
    }


    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }


    public String getFilmActor() {
        return filmActor;
    }


    public void setFilmActor(String filmActor) {
        this.filmActor = filmActor;
    }


    public String getOnlyDescribe() {
        return onlyDescribe;
    }


    public void setOnlyDescribe(String onlyDescribe) {
        this.onlyDescribe = onlyDescribe;
    }


    public String getGutdescipty() {
        return gutdescipty;
    }


    public void setGutdescipty(String gutdescipty) {
        this.gutdescipty = gutdescipty;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public String getPixType() {
        return pixType;
    }


    public void setPixType(String pixType) {
        this.pixType = pixType;
    }


    public String getPicture() {
        return picture;
    }


    public void setPicture(String picture) {
        this.picture = picture;
    }


}
