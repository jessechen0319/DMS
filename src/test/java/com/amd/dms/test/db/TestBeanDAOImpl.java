package com.amd.dms.test.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestBeanDAOImpl implements TestBeanDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(String name, Integer age) {
		String SQL = "INSERT INTO public.\"testBean\"(name, age, id) VALUES (?, ?, nextval('serial'))";

		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}

	public TestBean getTestBean(Integer id) {
		String SQL = "select * from TestBean where id = ?";
		TestBean TestBean = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new TestBeanMapper());
		return TestBean;
	}

	public List<TestBean> listTestBeans() {
		String SQL = "select * from TestBean";
		List<TestBean> TestBeans = jdbcTemplateObject.query(SQL, new TestBeanMapper());
		return TestBeans;
	}

	public void delete(Integer id) {
		String SQL = "delete from TestBean where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	public void update(Integer id, Integer age) {
		String SQL = "update TestBean set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}

	public TestBean getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TestBean> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}
}
