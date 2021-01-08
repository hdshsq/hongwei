package cn.song.hongwei.services;

import cn.song.hongwei.sys.pojo.UserDO;
import cn.song.hongwei.sys.services.IUserServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @program: hongwei
 * @description: 用户数据业务层接口测试
 * @author: Mr.Song
 * @create: 2020-10-19 10:21
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class SysUserServicesTests {

    @Autowired
    IUserServices iUserServices;

    @Test
    public void addUserData1() {
        try {
            UserDO userDO = new UserDO();
            userDO.setUsername("gong");
            userDO.setPassword("1234");
            userDO.setCreatedTime(new Date());
            userDO.setCreatedUser("root");

            iUserServices.addUserData(userDO,"Init");
            System.out.println("OK");

        } catch (Exception e){
            System.out.println("出错了");
            e.printStackTrace();
        }

    }
}
