package com.zhuguang.jack.dao;

import java.util.List;

import com.zhuguang.jack.vo.UserVO;

public interface UserDAO {
    public List<UserVO> findUsers();
    
    public Integer addUser(UserVO userVO);
}
