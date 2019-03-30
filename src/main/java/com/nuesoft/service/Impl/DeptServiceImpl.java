package com.nuesoft.service.Impl;

import com.nuesoft.dao.DeptMapper;
import com.nuesoft.po.Dept;
import com.nuesoft.po.DeptExample;
import com.nuesoft.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public int deleteByPrimaryKey(Integer deptid) {
        return deptMapper.deleteByPrimaryKey(deptid);
    }

    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public List<Dept> selectByExample(DeptExample example) {
        return deptMapper.selectByExample(example);
    }

    @Override
    public Dept selectByPrimaryKey(Integer deptid) {
        return deptMapper.selectByPrimaryKey(deptid);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }
}
