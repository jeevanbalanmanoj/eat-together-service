package com.eattogether.repository;

import org.springframework.data.repository.CrudRepository;

import com.eattogether.entity.UserGroup;

public interface UserGroupRepository extends CrudRepository<UserGroup, Long> {

}
