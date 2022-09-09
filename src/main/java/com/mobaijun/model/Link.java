package com.mobaijun.model;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: Link
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:44
 */
public class Link {
    private String href;
    private String rel;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    @Override
    public String toString() {
        return "Link{" +
                "href='" + href + '\'' +
                ", rel='" + rel + '\'' +
                '}';
    }
}
