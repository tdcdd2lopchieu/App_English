package com.nhom3.project.data_models;

public class Questions {
    private int type;
    private String desc;
    private String content;
    private int score;
    private String sound;
    private  String image;

    public Questions(int type, String desc, String content, int score, String sound, String image) {
        this.type = type;
        this.desc = desc;
        this.content = content;
        this.score = score;
        this.sound = sound;
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
