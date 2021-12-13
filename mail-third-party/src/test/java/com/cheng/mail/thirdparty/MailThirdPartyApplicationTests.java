package com.cheng.mail.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MailThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;
    @Test
    public void testUpload() throws FileNotFoundException {
// 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        InputStream inputStream = new FileInputStream("/home/cheng/Pictures/abc.jpeg");
// 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
        ossClient.putObject("mail-ssc", "abcde.jpeg", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传完成...");
    }
    @Test
    void contextLoads() {
    }

}
