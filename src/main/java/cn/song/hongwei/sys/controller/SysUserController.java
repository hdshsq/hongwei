package cn.song.hongwei.sys.controller;

import cn.song.hongwei.sys.pojo.UserDO;
import cn.song.hongwei.sys.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hongwei
 * @description: 用户信息的控制层接口
 * @author: Mr.Song
 * @create: 2020-10-19 11:25
 **/
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    IUserServices iUserServices;

    @RequestMapping("addUsers")
    public void addUsers(UserDO userDO){

    }
}
