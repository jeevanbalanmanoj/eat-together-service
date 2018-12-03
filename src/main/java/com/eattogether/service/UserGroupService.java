package com.eattogether.service;

import java.util.List;

import com.eattogether.entity.User;
import com.eattogether.entity.UserGroup;

public interface UserGroupService {

	public String addUserGroup(UserGroup group);

	public List<UserGroup> getAllUserGroups();

    String addUser(User user);

    User getUserInfo(String username);

    int updateGroupJoin(Integer userId, Integer groupId);
}
