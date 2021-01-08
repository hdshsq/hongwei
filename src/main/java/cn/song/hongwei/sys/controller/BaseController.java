package cn.song.hongwei.sys.controller;

import cn.song.hongwei.common.pojo.JsonResult;

/**
 * @program: hongwei
 * @description: 控制层接口的父类，统一异常处理
 * @author: Mr.Song
 * @create: 2020-10-19 11:28
 **/

public class BaseController {


    public JsonResult<Void> doHandleShiroException() {
        return null;
    }
}


