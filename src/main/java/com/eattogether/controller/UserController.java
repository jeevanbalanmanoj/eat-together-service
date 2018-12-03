package com.eattogether.controller;

import com.eattogether.domain.UserDTO;
import com.eattogether.entity.User;
import com.eattogether.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by manojj on 8/6/2018.
 */
@RestController
public class UserController {
	
	@Autowired
	UserGroupService userGroupService;

    @RequestMapping(path="/EatTogether/User",method= RequestMethod.POST)
    public String addUser(@RequestBody UserDTO userDTO){
    	User user = new User();
    	user.setUserName(userDTO.getUsername());
  user.setFirstName(userDTO.getFirstName());
  user.setLastName(userDTO.getLastName());
  user.setEmail(userDTO.getEmail());
  user.setPassword(userDTO.getPassword());
        return userGroupService.addUser(user);
    }

    @RequestMapping("/EatTogether/User")
    public User getUser(@RequestParam String username){
        return userGroupService.getUserInfo(username);
    }

    @RequestMapping(path="/EatTogether/User/Join", method= RequestMethod.POST)
    public int updateGroupJoin(@RequestBody Integer userId, @RequestParam Integer groupId){
        return userGroupService.updateGroupJoin(userId, groupId);
    }
}
