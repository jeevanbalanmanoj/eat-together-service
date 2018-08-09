package com.eattogether.service;

import java.util.ArrayList;
import java.util.List;

import com.eattogether.entity.User;
import com.eattogether.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eattogether.entity.UserGroup;
import com.eattogether.repository.UserGroupRepository;

@Service
public class UserGroupServiceImpl implements UserGroupService{

	@Autowired
	UserGroupRepository groupRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public String addUserGroup(UserGroup group) {
		groupRepository.save(group);
		return "saved";
	}

	@Override
	public List<UserGroup> getAllUserGroups() {
		List<UserGroup> groups = new ArrayList<>();
		groupRepository.findAll().forEach(groups::add);
		return groups;
	}

	@Override
	public String addUser(User user) {
		userRepository.save(user);
		return "saved";
	}

    @Override
    public User getUserInfo(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public int updateGroupJoin(Integer userId, Integer groupId) {
        return userRepository.setUserInfoById(userId,groupId);
    }


}
