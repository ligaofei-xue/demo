package com.ligaofei.demo.mapper;

import com.ligaofei.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Insert("insert into user(name, phone) values(#{name},#{phone})")
    int save(User user);

}
