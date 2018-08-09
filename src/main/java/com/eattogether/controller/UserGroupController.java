package com.eattogether.controller;

import java.util.List;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eattogether.domain.UserGroupDTO;
import com.eattogether.entity.UserGroup;
import com.eattogether.service.UserGroupService;

/**
 * Created by manojj on 8/6/2018.
 */
@RestController
public class UserGroupController {
	
	@Autowired
	UserGroupService userGroupService;

    @RequestMapping("/EatTogether/about")
    public String about(){
        return " Get connected with like minded people over great food";
    }
    @RequestMapping(path="/EatTogether/UserGroup",method= RequestMethod.POST)
    public String addUserGroup(@RequestBody UserGroupDTO groupDTO){
    	UserGroup group = new UserGroup();
    	group.setName(groupDTO.getName());
        return userGroupService.addUserGroup(group);
    }

    @RequestMapping("/EatTogether/UserGroups")
    public List<UserGroup> getAllUserGroups(){
        return userGroupService.getAllUserGroups();
    }

}
