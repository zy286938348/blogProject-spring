package com.nuc.bean;

public class Blog {
    private int id;
    private int lId;
    private String title;
    private String chilTitle;
    private String contect;
    private int type;
    private int status;

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChilTitle() {
        return chilTitle;
    }

    public void setChilTitle(String chilTitle) {
        this.chilTitle = chilTitle;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", lId=" + lId +
                ", title='" + title + '\'' +
                ", chilTitle='" + chilTitle + '\'' +
                ", contect='" + contect + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
