package com.usman.dao;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.usman.MyBatisUtility.MyBatisUtility;
import com.usman.model.Model;

@Repository
public class ModelMapper {
	
	
	public List<Model> getEmployeeList() {
		
		SqlSession session = MyBatisUtility.getSqlSessionFactory().openSession() ;
		
		List<Model> elist = session.selectList("getAllEmployees") ;
		return elist ;
	}

}
