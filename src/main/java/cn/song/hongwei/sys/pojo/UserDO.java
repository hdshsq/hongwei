package cn.song.hongwei.sys.pojo;

import java.util.Objects;

/**
 * @program: hongwei
 * @description: 用户的实体类
 * @author: Mr.Song
 * @create: 2020-09-27 17:07
 **/
public class UserDO extends BaseDO {

    private Integer uid;
    private String username;
    private String password;
    private Integer role;
    private String employer;
    private String address;
    private String imageParh;
    private int isDelete;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageParh() {
        return imageParh;
    }

    public void setImageParh(String imageParh) {
        this.imageParh = imageParh;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDO)) return false;
        if (!super.equals(o)) return false;
        UserDO userDO = (UserDO) o;
        return isDelete == userDO.isDelete &&
                Objects.equals(uid, userDO.uid) &&
                Objects.equals(username, userDO.username) &&
                Objects.equals(password, userDO.password) &&
                Objects.equals(role, userDO.role) &&
                Objects.equals(employer, userDO.employer) &&
                Objects.equals(address, userDO.address) &&
                Objects.equals(imageParh, userDO.imageParh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uid, username, password, role, employer, address, imageParh, isDelete);
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", employer='" + employer + '\'' +
                ", address='" + address + '\'' +
                ", imageParh='" + imageParh + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}

