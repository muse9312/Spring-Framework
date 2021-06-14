package com.block.spring.dao;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.block.spring.dto.EmployeeDTO;

@Repository
public class BlockDaoImpl implements BlockDao {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession SqlSessionTemplate;
	
	final private String query = "a";

	@Override
	public void list() {
		System.out.println(dataSource);
		int employeeID = 300;
	 	EmployeeDTO a = SqlSessionTemplate.selectOne(query + ".employee", employeeID);
	 	System.out.println(a);

	}

}
