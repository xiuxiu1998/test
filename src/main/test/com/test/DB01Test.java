package com.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

public class DB01Test {

@Test
public  void test(){
    //连接MongoDB
    MongoClient mong = new MongoClient("127.0.0.1",27017);
//    System.out.println("琳琳是小仙女");


    //获得数据库
    MongoDatabase user = mong.getDatabase("user");

    // 获得集合（表）
    MongoCollection<Document> tb_user = user.getCollection("tb_user");

    //操作CURD
    //添加
//    Document docum = new Document().append("_id",3).append("name","xxx").append("password","1111");
//    tb_user.insertOne(docum);


    //修改
//    Document docs = new Document("$set",new Document().append("name","秀秀"));
//    tb_user.updateOne(Filters.eq("_id",3), docs);

    //删除Filters
//    tb_user.deleteOne(Filters.eq("_id",3));

    //查询FindIterable
    FindIterable<Document> documents = tb_user.find();
    for (Document d : documents) {
        System.out.println(d.toJson());
    }

}




}
