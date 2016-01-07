package com.oocl.ita.shuttlebusschedule.service;

import com.oocl.ita.shuttlebusschedule.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHENED2 on 1/7/2016.
 */
public class UserService {

    public List<User> getScrollData(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setUsername("Eddy Chen");
        user.setBoardingStation("唐家");
        user.setEgressStation("唐家");
        users.add(user);
        return users;
    }
}
