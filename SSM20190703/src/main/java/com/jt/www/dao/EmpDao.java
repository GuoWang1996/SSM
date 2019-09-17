package com.jt.www.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.jt.www.entity.Emp;
@Mapper
public interface EmpDao {
    /**
     * 查询所有员工信息
     * @return
     */
    public List<Emp> findAllEmp();

    /**
     * 根据ID删除员工信息
     * @param empno
     * @return
     */
    public int deleteEmp(int empno);

    /**
     * 根据ID查询要修改的员工信息
     * @param empno
     * @return
     */
    public List<Emp> toUpdate(int empno);

    /**
     * 添加员工信息
     * @param emp
     * @return
     */
    public int insertEmp(Emp emp);

    /**
     * 修改员工信息
     * @param emp
     * @return
     */
    public int updateEmp(Emp emp);
}