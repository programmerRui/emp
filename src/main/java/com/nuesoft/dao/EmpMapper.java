package com.nuesoft.dao;

import com.nuesoft.po.Emp;
import com.nuesoft.po.EmpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> selectAll(@Param("empdeptid") Integer empdeptid, @Param("empname") String empname, @Param("empwages") Integer empwages);

    int deleteByids(String[] empid);
}