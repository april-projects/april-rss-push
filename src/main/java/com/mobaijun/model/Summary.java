package com.mobaijun.model;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: Summary
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:44
 */
public class Summary {
    private String type;
    private String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
