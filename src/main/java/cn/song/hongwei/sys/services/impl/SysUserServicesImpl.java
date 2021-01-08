package cn.song.hongwei.sys.services.impl;

import cn.song.hongwei.sys.mapper.SysUserMappers;
import cn.song.hongwei.sys.pojo.UserDO;
import cn.song.hongwei.sys.services.IUserServices;
import cn.song.hongwei.sys.services.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @program: hongwei
 * @description: 用户数据操作实现类接口
 * @author: Mr.Song
 * @create: 2020-10-19 09:42
 **/
@Service
public class SysUserServicesImpl implements IUserServices {

    @Autowired
    private SysUserMappers mappers;

    @Override
    public void addUserData(UserDO userDO,String CLIENT_ID) throws InsertException {
        System.err.println("111");
        if (StringUtils.isEmpty(userDO.getUsername())){
            //此处异常可以替换，命名有问题
            throw new InsertException("用户名不能为空");
        }
        if (StringUtils.isEmpty(userDO.getPassword())){
            //此处异常可以替换，命名有问题
            throw new InsertException("输入信息有误，用户名和密码不能为空");
        }

        //补充数据
        userDO.setCreatedUser(CLIENT_ID);
        userDO.setCreatedTime(new Date());
        userDO.setModifiedUser(CLIENT_ID);
        userDO.setModifiedTime(new Date());
        userDO.setIsDelete(0);

        //插入数据
        Integer result = mappers.insertUser(userDO);
        if(result==null){
            throw new InsertException("发生未知错误请联系管理员");
        }


    }
}
