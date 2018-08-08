package com.eattogether.service;

import java.util.List;

import com.eattogether.entity.UserGroup;

public interface UserGroupService {

	public String addUserGroup(UserGroup group);

	public List<UserGroup> getAllUserGroups();

}
