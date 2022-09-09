package com.mobaijun.model;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: Generator
 * class description： json 对象
 *
 * @author MoBaiJun 2022/9/9 15:45
 */
public class Generator {
    private String uri;
    private String content;

    public Generator() {
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "uri='" + uri + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
