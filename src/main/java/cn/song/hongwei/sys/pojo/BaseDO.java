package cn.song.hongwei.sys.pojo;


import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.Date;
import java.util.Objects;

public class BaseDO extends SqlSessionDaoSupport {

    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

//    @Resource
//    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
//        super.setSqlSessionFactory(sqlSessionFactory);
//    }
//
//    @Resource
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        super.setSqlSessionTemplate(sqlSessionTemplate);
//    }

    protected Object getMapper(Class clazz){
        return getSqlSession().getMapper(clazz);
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseDO)) return false;
        BaseDO baseDO = (BaseDO) o;
        return Objects.equals(createdUser, baseDO.createdUser) &&
                Objects.equals(createdTime, baseDO.createdTime) &&
                Objects.equals(modifiedUser, baseDO.modifiedUser) &&
                Objects.equals(modifiedTime, baseDO.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdUser, createdTime, modifiedUser, modifiedTime);
    }

    @Override
    public String toString() {
        return "BaseDO{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
