package com.mobaijun;

import com.mobaijun.model.FeedEntity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: FileUtil
 * class description： 文件工具类
 *
 * @author MoBaiJun 2022/9/9 17:28
 */
public class FileUtil {
    private final static Path CACHE_TEXT = Paths.get("cache.text");
    public static void writer(List<FeedEntity> list){
        list.forEach(temp -> {
            try {
                if (!Files.exists(CACHE_TEXT)) {
                    Files.createFile(CACHE_TEXT);
                }
                Files.write(CACHE_TEXT, temp.numberArticleStore().getBytes(), StandardOpenOption.APPEND);
                Files.write(CACHE_TEXT, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
