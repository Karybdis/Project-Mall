package com.cheng.mail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheng.mail.product.entity.BrandEntity;
import com.cheng.mail.product.service.BrandService;
import com.cheng.mail.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Slf4j
@SpringBootTest
class MailProductApplicationTests
{
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;

    @Test
    public void test(){
        Long[] catelogPath = categoryService.findCatelogPath(229L);
        log.info("完整路径:{}", Arrays.asList(catelogPath));
    }
//    @Autowired
//    OSSClient ossClient;
//    @Test
//    public void testUpload() throws FileNotFoundException {
//        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
////        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
////// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
////        String accessKeyId = "XXXXXXXXXXXXXXXX";
////        String accessKeySecret = "olYzngfk2r3oE69f1fcjVn9artzNtW";
////
////// 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//        InputStream inputStream = new FileInputStream("/home/cheng/Pictures/abc.jpeg");
//// 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
//        ossClient.putObject("mail-ssc", "abc.jpeg", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
//
//        System.out.println("上传完成...");
//    }

    @Test
    void contextLoads() {
//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("NIKE");
//        brandService.updateById(brandEntity);
//        brandEntity.setName("Nike");
//        brandService.save(brandEntity);
//        System.out.println("Succeed!!");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        System.out.println(list);
    }
}
