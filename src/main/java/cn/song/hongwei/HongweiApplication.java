package cn.song.hongwei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
@MapperScan("cn.song.hongwei.sys.mapper")
public class HongweiApplication {


    public static void main(String[] args) {

        /**
         * @Description:
         * @Param: [args]
         * @return: void
         * @Author: Mr.Song
         * @Date: 2020/9/28
         */
        SpringApplication.run(HongweiApplication.class, args);
        System.out.println("Hello World");
    }

}
