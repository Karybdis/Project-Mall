package com.cheng.mail.search;

import com.alibaba.fastjson.JSON;
import com.cheng.mail.search.config.MailElasticSearchConfig;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class MailSearchApplicationTests {
    @Autowired
    RestHighLevelClient restHighLevelClient;

    @Test
    void contextLoads() throws IOException {
        IndexRequest indexRequest = new IndexRequest("users");
        indexRequest.id("1");
        User user = new User();
        user.setUserName("mike");
        user.setGender("M");
        user.setAge(20);
        String s = JSON.toJSONString(user);
        indexRequest.source(s, XContentType.JSON);

        IndexResponse index = restHighLevelClient.index(indexRequest, MailElasticSearchConfig.COMMON_OPTIONS);
        System.out.println(index);
    }

    @Data
    class User{
        private String userName;
        private String gender;
        private Integer age;
    }
}
