package com.leehom.cn.controller;
import com.leehom.cn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 * @Author: Leehom
 * @Description:
 * @Date: Created in 17:41 2020/1/2
 * @Modified By:
 */
@Controller
public class ThymeController {

    @GetMapping("/all")
    public String all(ModelMap model) {

        // 查询用户
        List<User> users = new ArrayList<>();
        User user1 = new User("1", "小明1", "xiaoming1", 11, 1, new Date(), "1");
        User user2 = new User("2", "小明2", "xiaoming2", 12, 1, new Date(), "2");
        User user3 = new User("3", "小明3", "xiaoming3", 13, 1, new Date(), "3");
        User user4 = new User("4", "小明4", "xiaoming4", 14, 1, new Date(), "4");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        // 放入模型
        model.addAttribute("users", users);
        // 返回模板名称
        return "users";
    }
}
