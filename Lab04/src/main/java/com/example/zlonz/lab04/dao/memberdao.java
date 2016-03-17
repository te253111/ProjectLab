package com.example.zlonz.lab04.dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Zlonz on 17/3/2559.
 */
public class memberdao {
    @SerializedName("_id") private String id;
    @SerializedName("_ns") private String ns;
    @SerializedName("createdAt") private String createdat;
    @SerializedName("desc") private String desc;
    @SerializedName("publishedAt") private String publishedat;
    @SerializedName("source") private String source;
    @SerializedName("type") private String  type;
    @SerializedName("url") private String url;
    @SerializedName("used") private String used;
    @SerializedName("who") private String who;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedat() {
        return publishedat;
    }

    public void setPublishedat(String publishedat) {
        this.publishedat = publishedat;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
