package com.mobaijun.model;

import java.util.Date;
import java.util.List;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: Entry
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:44
 */
public class Entry {
    private String title;
    private Link link;
    private String id;
    private Date published;
    private Date updated;
    private Summary summary;
    private List<Category> category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "title='" + title + '\'' +
                ", link=" + link +
                ", id='" + id + '\'' +
                ", published=" + published +
                ", updated=" + updated +
                ", summary=" + summary +
                ", category=" + category +
                '}';
    }
}
