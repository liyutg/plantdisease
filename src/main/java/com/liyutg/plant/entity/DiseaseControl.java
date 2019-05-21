package com.liyutg.plant.entity;

import java.util.Date;

public class DiseaseControl {
    private Integer messageId;

    private String type01;

    private String type02;

    private String type03;

    private String type04;

    private String title;

    private String articleMessage;

    private Date data;

    private String imageUrl;

    private String articleText;

    private String introductionTitle;

    private String introductionImgUrl;

    private String introductionDate;

    private String introductionText;

    public DiseaseControl(Integer messageId, String type01, String type02, String type03, String type04, String title, String articleMessage, Date data, String imageUrl, String articleText, String introductionTitle, String introductionImgUrl, String introductionDate, String introductionText) {
        this.messageId = messageId;
        this.type01 = type01;
        this.type02 = type02;
        this.type03 = type03;
        this.type04 = type04;
        this.title = title;
        this.articleMessage = articleMessage;
        this.data = data;
        this.imageUrl = imageUrl;
        this.articleText = articleText;
        this.introductionTitle = introductionTitle;
        this.introductionImgUrl = introductionImgUrl;
        this.introductionDate = introductionDate;
        this.introductionText = introductionText;
    }

    public DiseaseControl() {
        super();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getType01() {
        return type01;
    }

    public void setType01(String type01) {
        this.type01 = type01 == null ? null : type01.trim();
    }

    public String getType02() {
        return type02;
    }

    public void setType02(String type02) {
        this.type02 = type02 == null ? null : type02.trim();
    }

    public String getType03() {
        return type03;
    }

    public void setType03(String type03) {
        this.type03 = type03 == null ? null : type03.trim();
    }

    public String getType04() {
        return type04;
    }

    public void setType04(String type04) {
        this.type04 = type04 == null ? null : type04.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getArticleMessage() {
        return articleMessage;
    }

    public void setArticleMessage(String articleMessage) {
        this.articleMessage = articleMessage == null ? null : articleMessage.trim();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText == null ? null : articleText.trim();
    }

    public String getIntroductionTitle() {
        return introductionTitle;
    }

    public void setIntroductionTitle(String introductionTitle) {
        this.introductionTitle = introductionTitle == null ? null : introductionTitle.trim();
    }

    public String getIntroductionImgUrl() {
        return introductionImgUrl;
    }

    public void setIntroductionImgUrl(String introductionImgUrl) {
        this.introductionImgUrl = introductionImgUrl == null ? null : introductionImgUrl.trim();
    }

    public String getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(String introductionDate) {
        this.introductionDate = introductionDate == null ? null : introductionDate.trim();
    }

    public String getIntroductionText() {
        return introductionText;
    }

    public void setIntroductionText(String introductionText) {
        this.introductionText = introductionText == null ? null : introductionText.trim();
    }
}