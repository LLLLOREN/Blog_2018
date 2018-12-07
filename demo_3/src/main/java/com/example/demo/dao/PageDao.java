package com.example.demo.dao;

import com.example.demo.entity.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface PageDao {
    Collection<Page> findPage(String keyword);
}
