package com.eattogether.repository;

import com.eattogether.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT t FROM User t where t.userName = ?1")
    User findByUserName(String userName);


    @Modifying
    @Query("update User u set u.userGroup = ?2 where u.id = ?1")
    int setUserInfoById(Integer userId, Integer id);
}
