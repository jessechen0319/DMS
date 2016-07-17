package com.amd.dms.test.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TestBeanMapper implements RowMapper<TestBean> {

	public TestBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		TestBean student = new TestBean();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
