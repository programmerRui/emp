package com.nuesoft.service.Impl;

import com.nuesoft.dao.EmpMapper;
import com.nuesoft.po.Dept;
import com.nuesoft.po.Emp;
import com.nuesoft.po.EmpExample;
import com.nuesoft.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public int deleteByPrimaryKey(Integer empid) {
        return empMapper.deleteByPrimaryKey(empid);
    }

    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public int insertSelective(Emp record) {
        return empMapper.insertSelective(record);
    }

    @Override
    public List<Emp> selectByExample(EmpExample example) {
        return empMapper.selectByExample(example);
    }

    @Override
    public Emp selectByPrimaryKey(Integer empid) {
        return empMapper.selectByPrimaryKey(empid);
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return empMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return empMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Emp> selectAll(Integer empdeptid, String empname, Integer empwages) {
        return empMapper.selectAll(empdeptid,empname,empwages);
    }

    @Override
    public int deleteByids(String[] empid) {
        return empMapper.deleteByids(empid);
    }

}
