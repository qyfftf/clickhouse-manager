package com.qyfftf.clickhousemanager;

import com.qyfftf.clickhousemanager.dao.TablesDao;
import com.qyfftf.clickhousemanager.entity.Tables;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ClickhousemanagerApplicationTests {
    @Autowired
    TablesDao tablesDao;

    @Test
    void contextLoads() {
        List<Tables> list = tablesDao.list();
        list.forEach(i-> System.out.println(i));
    }

}
