package com.mobaijun.model;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: Category
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:44
 */
public class Category {
    private String term;
    private String scheme;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        return "Category{" +
                "term='" + term + '\'' +
                ", scheme='" + scheme + '\'' +
                '}';
    }
}
