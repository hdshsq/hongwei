package cn.song.hongwei.sys.util;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @program: hongwei
 * @description: 解决服务层调用时一直为null的异常
 * @author: Mr.Song
 * @create: 2020-10-19 10:48
 **/
@Component
public class ServicesHandler extends IoHandlerAdapter {

    @Autowired
   // protected Health
    private static ServicesHandler servicesHandler;


    @PostConstruct
    public void init(){
        servicesHandler=this;

    }

}
