package com.mobaijun.model;

import java.util.Date;
import java.util.List;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: FeedEntity
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:43
 */
public class FeedEntity {
    private String xmlns;
    private String title;
    private String subtitle;
    private List<Link> link;
    private Date updated;
    private String id;
    private Author author;
    private Generator generator;
    private List<Entry> entry;

    public String numberArticleStore() {
        if (author != null) {
            return String.format("博主名称：[%s],当前 rss 更新数量为：(%s)篇;", author.getName(), entry.size());
        }
        return "";
    }

    public FeedEntity() {
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> link) {
        this.link = link;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "FeedEntity{" +
                "xmlns='" + xmlns + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", link=" + link +
                ", updated=" + updated +
                ", id='" + id + '\'' +
                ", author=" + author +
                ", generator=" + generator +
                ", entry=" + entry +
                '}';
    }
}
