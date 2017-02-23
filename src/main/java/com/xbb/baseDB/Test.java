package com.xbb.baseDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{   
		       // 连接到 mongodb 服务
		         MongoClient mongoClient = new MongoClient( "192.168.141.160" , 27017 );
		       
		         // 连接到数据库
		         MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");  
		       System.out.println("Connect to database successfully");
		        
		      }catch(Exception e){
		        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     }
	}

}
