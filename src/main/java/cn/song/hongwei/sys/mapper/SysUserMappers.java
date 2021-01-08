package cn.song.hongwei.sys.mapper;

import cn.song.hongwei.sys.pojo.UserDO;
import org.apache.ibatis.annotations.Param;


/**
 * @program: hongwei
 * @description: 操作用户数据的持久层接口
 * @author: Mr.Song
 * @create: 2020-09-27 17:18
 **/
public interface SysUserMappers {

    
    int insertUser(UserDO userDO);

    UserDO findUserByUsername(@Param("username") String username);


}
