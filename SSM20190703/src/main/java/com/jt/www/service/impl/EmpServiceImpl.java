package com.jt.www.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jt.www.dao.EmpDao;
import com.jt.www.entity.Emp;
import com.jt.www.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao dao;

	public List<Emp> findAllEmp() {
		return dao.findAllEmp();
	}

	public int deleteEmp(int empno) {
		return dao.deleteEmp(empno);
	}

	public List<Emp> toUpdate(int empno) {
		return dao.toUpdate(empno);
	}

	public int insertEmp(Emp emp) {
		
		return dao.insertEmp(emp);
	}

	public int updateEmp(Emp emp) {
		return dao.updateEmp(emp);
	}
}
