package com.fisco.app.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    void insertUser(@Param("id")int id, @Param("username")String username, @Param("signUserId")String signUserId, @Param("publicAddress")String publicAddress,
                    @Param("privateKey")String privateKey, @Param("status")String status);
}
