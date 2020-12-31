package com.push.config;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;

public class MongoDBJDBC {

	public MongoCollection<Document> connectMongoDB() {

		//TODO：连接到MongoDB服务
		MongoClient mongoClient = new MongoClient("localhost", 27017);

		//TODO：连接到数据库
		MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

		System.out.println("成功连接到MongoDB数据库");

		MongoCollection<Document> collection = mongoDatabase.getCollection("message");
		System.out.println("集合message选择成功");

		return collection;
	}

	/**
	 * 根据guid获取集合列表
	 * @param collection
	 * @param guid
	 * @return
	 */
	public List<String> query(MongoCollection<Document> collection, String guid) {
		List list = new ArrayList<String>();
		/**
		 * 1.获取迭代器FindIterable<Document>
		 * 2.获取游标MongoCursor<Document>
		 * 3.通过游标遍历检索出的文档集合
		 */

		List<String> listNames = new ArrayList<String>();
		listNames.add("guid");
		listNames.add("readStatus");
		listNames.add("category");
		listNames.add("title");
		listNames.add("message");
		FindIterable<Document> findIterable = collection.find(Filters.eq("guid", guid))
				.projection(Projections.include(listNames));//如果要查询指定字段就加上这句（注意：_id字段是必须展示的）
		MongoCursor<Document> mongoCursor = findIterable.iterator();
		while (mongoCursor.hasNext()) {
			list.add(mongoCursor.next());
		}
		return list;
	}

}
