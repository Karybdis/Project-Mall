package com.cheng.mail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheng.mail.product.dao.AttrGroupDao;
import com.cheng.mail.product.dao.SkuSaleAttrValueDao;
import com.cheng.mail.product.entity.BrandEntity;
import com.cheng.mail.product.service.BrandService;
import com.cheng.mail.product.service.CategoryService;
import com.cheng.mail.product.service.SkuSaleAttrValueService;
import com.cheng.mail.product.vo.SkuItemSaleAttrVo;
import com.cheng.mail.product.vo.SpuItemAttrGroupVo;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

@Slf4j
@SpringBootTest
class MailProductApplicationTests
{
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedissonClient redissonClient;

    @Autowired
    AttrGroupDao attrGroupDao;

    @Autowired
    SkuSaleAttrValueDao skuSaleAttrValueDao;

    @Test
    public void test(){
        List<SkuItemSaleAttrVo> saleAttrsBySpuId = skuSaleAttrValueDao.getSaleAttrsBySpuId(13L);
        System.out.println(saleAttrsBySpuId);
    }
//    @Autowired
//    OSSClient ossClient;
//    @Test
//    public void testUpload() throws FileNotFoundException {
//        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
////        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
////// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
////        String accessKeyId = "";
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
