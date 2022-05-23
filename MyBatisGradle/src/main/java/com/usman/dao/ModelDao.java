package com.usman.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.usman.model.Model;
import com.usman.mybatisUtility.MyBatisUtility;

@Repository
public class ModelDao {

	
	
	public static List<Model> getCustomers() {
		
			SqlSession session = MyBatisUtility.getsqlSessionFactory().openSession() ;
			
			List<Model> mlist = session.selectList("getAllmodels") ;
			
			session.commit();
			session.close();

		return mlist;
		
		
		
		
	}
}
