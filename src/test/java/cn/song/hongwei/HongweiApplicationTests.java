package cn.song.hongwei;

import cn.song.hongwei.sys.logger.Log;
import cn.song.hongwei.sys.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class HongweiApplicationTests {

    @Autowired
    //Dog dog;
    Person person;

    @Autowired
    Log log;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void recodeTest(){
        String var = "测试信息111";
        log.recodeInfo(5,var);
        System.err.println("完成");
    }



}
