package com.pyh.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class JdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/addUser")
    public String addUser()
    {
        String sql="insert into user values(1,'昊昊');";
        jdbcTemplate.update(sql);
        return "redirect:/userList";
    }

    @RequestMapping("/userList")
    @ResponseBody
    public List<Map<String,Object>> userList()
    {
        String sql="select * from user";
        List<Map<String,Object>> list_map=jdbcTemplate.queryForList(sql);
        return list_map;
    }

    @RequestMapping("/update/{id}")
    public String updateUser(@PathVariable Integer id)
    {
        String sql="update user set name='熙熙' where id=1";
        jdbcTemplate.update(sql);
        return "redirect:/userList";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id)
    {
        String sql="delete from user where id=?";
        jdbcTemplate.update(sql,id);
        return "redirect:/userList";
    }
}
