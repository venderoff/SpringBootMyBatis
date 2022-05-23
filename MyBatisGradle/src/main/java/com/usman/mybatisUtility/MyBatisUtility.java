package com.usman.mybatisUtility;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtility {

	
	private static SqlSessionFactory sqlSessionFactory ;
	
	static {
		
		Reader reader ;
		
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml") ;
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader) ;
		  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static SqlSessionFactory getsqlSessionFactory() {
			
			return sqlSessionFactory ;
			
		}
		
	}
	

