package cn.song.hongwei.sys.services;

import cn.song.hongwei.sys.pojo.UserDO;
import cn.song.hongwei.sys.services.ex.InsertException;

/**
 * @program: hongwei
 * @description: 用户数据层接口
 * @author: Mr.Song
 * @create: 2020-10-15 17:26
 **/
public interface IUserServices {

    /**
     *  添加一条用户数据，不支持自行创建只能由管理员等人工创建
     * @param userDO
     * @param CLIENT_ID 当前用户的用户名，
     * @return
     * @throws InsertException 添加失败时的异常
     */
    public void addUserData(UserDO userDO,String CLIENT_ID) throws InsertException;


}
