package com.eattogether.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eattogether.entity.UserGroup;
import com.eattogether.repository.UserGroupRepository;

@Service
public class UserGroupServiceImpl implements UserGroupService{

	@Autowired
	UserGroupRepository groupRepository;

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

}
