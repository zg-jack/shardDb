package com.zhuguang.jack.vo;

import org.apache.ibatis.type.Alias;

@Alias("UserVO")
public class UserVO {
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private Integer sex;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    
    public Integer getSex() {
        return sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
