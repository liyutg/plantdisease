package com.liyutg.plant.entity;

import java.util.Date;

public class UploadImage {
    private Integer id;

    private String imageName;

    private String dimClass;

    private Date data;

    public UploadImage(Integer id, String imageName, String dimClass, Date data) {
        this.id = id;
        this.imageName = imageName;
        this.dimClass = dimClass;
        this.data = data;
    }

    public UploadImage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getDimClass() {
        return dimClass;
    }

    public void setDimClass(String dimClass) {
        this.dimClass = dimClass == null ? null : dimClass.trim();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}