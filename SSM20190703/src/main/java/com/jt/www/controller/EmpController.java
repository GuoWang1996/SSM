package com.jt.www.controller;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.www.dao.EmpDao;
import com.jt.www.entity.Emp;
import com.jt.www.service.EmpService;

@Controller
@RequestMapping("emp")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class EmpController {
	@Autowired
	private EmpService ser;
	@Autowired
	private EmpDao dao;

	@RequestMapping("/findallemp")
	public String findAllEmp(Model model) throws Exception {
		List<Emp> list = ser.findAllEmp();
		if(list!=null){
			throw new  Exception();
		}
		model.addAttribute("list", list);
		
		return "allemp";
	}

	@RequestMapping("/deleteemp")
	public String deleteEmp(int empno) {
		ser.deleteEmp(empno);
		return "redirect:/emp/findallemp.do";
	}

	@RequestMapping("/toupdate")
	public String toUpdate(Integer empno, Model model) {
		if (empno != null) {
			List<Emp> list = ser.toUpdate(empno);
			model.addAttribute("emp", list.get(0));
		}
		return "ioru";
	}

	
	@PostMapping("/insertorupdateemp")
	public String InsertOrUpdateEmp(Emp emp) {
		
			ser.insertEmp(emp);
		
		return "redirect:/emp/findallemp.do";
	}
	
      //	单元测试数据库连接是否成功
	  @Test
	    public void setDateSource() throws SQLException {
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

			BasicDataSource dataSource = (BasicDataSource)ctx.getBean("dataSource");
			System.out.println(dataSource.getConnection());
	    }
	  @Test
	   public void testInsert() throws Exception{           
		  Emp e=new Emp();
		  e.setEmpno(4);
		  e.setEname("王五");
		  e.setComm(2);
		  e.setJob("程序员");
		  e.setMgr(2);
		  e.setHiredate("2");
		  e.setSal(2.0);
		  e.setDeptno(2);
		  if(e.getEmpno()!=null){
			  throw new Exception();
		  }
		  System.out.println("test_git");
	//	dao.insert(e);
	  }
}
