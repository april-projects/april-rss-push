package com.mobaijun;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.hutool.json.XML;
import com.mobaijun.constant.Constant;
import com.mobaijun.model.FeedEntity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 * @author mobaijun
 */
public class RssApplicationRun {
    public static void main(String[] args) {
        LinkedList<String> collect = Arrays.stream(Constant.RSS_ADDRESS)
                .map(HttpUtil::get)
                .collect(Collectors.toCollection(LinkedList::new));
        LinkedList<JSONObject> collect1 = collect.stream()
                .map(temp -> JSONUtil.parseObj(JSONUtil.toJsonStr(XML.toJSONObject(temp))))
                .collect(Collectors.toCollection(LinkedList::new));
        LinkedList<FeedEntity> entities = collect1.stream()
                .map(temp -> JSONUtil.toBean(temp.get("feed").toString(), FeedEntity.class))
                .collect(Collectors.toCollection(LinkedList::new));
    }
}
