package com.fisco.app.DAO;

import com.fisco.app.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminDao {
    Admin selectAdmin(@Param("name") String name, @Param("password") String password);
}
