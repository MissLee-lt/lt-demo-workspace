package com.push.config;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDBJDBC {

	public MongoCollection<Document> connectMongoDB() {

		//TODO：连接到MongoDB服务
		MongoClient mongoClient = new MongoClient("localhost",27017);

		//TODO：连接到数据库
		MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

		System.out.println("成功连接到MongoDB数据库");

		MongoCollection<Document> collection = mongoDatabase.getCollection("mycol");
		System.out.println("集合mycol选择成功");

		return collection;
	}

	/**
	 * 根据guid获取集合列表
	 * @param collection
	 * @param guid
	 * @return
	 */
	public List<String> query(MongoCollection<Document> collection,String guid){
		List<String> list = new ArrayList<String>();
		/**
		 * 1.获取迭代器FindIterable<Document>
		 * 2.获取游标MongoCursor<Document>
		 * 3.通过游标遍历检索出的文档集合
		 */
		FindIterable<Document> findIterable = collection.find(new Document("guid",guid));
		MongoCursor<Document> mongoCursor = findIterable.iterator();
		while(mongoCursor.hasNext()){
			list.add(mongoCursor.next().toJson());
		}
		return list;
	}

}
