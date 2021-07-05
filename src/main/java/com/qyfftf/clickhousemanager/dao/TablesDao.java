package com.qyfftf.clickhousemanager.dao;

import com.qyfftf.clickhousemanager.entity.Tables;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TablesDao {
    List<Tables> list();
}
