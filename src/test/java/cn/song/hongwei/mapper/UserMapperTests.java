package cn.song.hongwei.mapper;

import cn.song.hongwei.sys.mapper.SysUserMappers;
import cn.song.hongwei.sys.pojo.UserDO;
import cn.song.hongwei.sys.util.ID_CodeVerify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @program: hongwei
 * @description: 用户持久层的测试类
 * @author: Mr.Song
 * @create: 2020-09-28 16:39
 **/

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {

    @Autowired
    SysUserMappers sysUserMappers;

    @Test
    public void insertUser() {
        UserDO userDO = new UserDO();
        userDO.setUsername("song2");
        userDO.setPassword("1234");
        userDO.setCreatedTime(new Date());
        userDO.setCreatedUser("root");

        sysUserMappers.insertUser(userDO);
        System.out.println(userDO.getUid());
    }

    @Test
    public void selectUser() {
        UserDO userDO = sysUserMappers.findUserByUsername("song1");
        System.out.println(userDO);
    }

    @Test
    public void numbetTest() {
        ID_CodeVerify id = new ID_CodeVerify();
        System.out.println(id.verify("130402199604173321"));

    }

}
