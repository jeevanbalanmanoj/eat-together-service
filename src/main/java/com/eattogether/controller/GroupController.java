package com.eattogether.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by manojj on 8/6/2018.
 */
@RestController
public class GroupController {

    @RequestMapping("/EatTogether/about")
    public String about(){
        return " Get connected with like minded people over great food";
    }

}
