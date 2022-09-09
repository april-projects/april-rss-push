package com.mobaijun.model;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: Author
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:45
 */
public class Author {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
