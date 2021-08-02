package com.pyh.springdata.controller;

import com.pyh.springdata.mapper.UserMapper;
import com.pyh.springdata.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class MybatisController {
    
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/madd")
    public String maddUser()
    {
        mapper.maddUser();
        return "redirect:/mselect";
    }

    @RequestMapping("/mselect")
    @ResponseBody
    public List<User> userList()
    {
        List<User> userList=mapper.mselectUser();
        return userList;
    }

    @RequestMapping("/mupdate")
    public String mupdateUser()
    {
        mapper.mupdateUser();
        return "redirect:/mselect";
    }

    @RequestMapping("/mdelete")
    public String mdeleteUser()
    {
        mapper.mdeleteUser();
        return "redirect:/mselect";
    }
    
    
}
