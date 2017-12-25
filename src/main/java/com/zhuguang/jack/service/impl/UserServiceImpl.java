package com.zhuguang.jack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuguang.jack.dao.UserDAO;
import com.zhuguang.jack.service.UserService;
import com.zhuguang.jack.vo.UserVO;

/** 
 *  往期视频加小露老师QQ：1533922121
 *  Jack老师QQ： 2943489129
 *  时间   ：     2017年12月25日 下午8:32:17 
 *  作者   ：   烛光学院【Jack老师】
 *  这个是服务层的实现类
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDAO userDAO;
    
    public List<UserVO> findUser() {
        List<UserVO> list = userDAO.findUsers();
        System.out.println(list.size());
        return list;
    }
    
    public void addUser(UserVO userVO) {
        userDAO.addUser(userVO);
        System.out.println("insert into user!!");
    }
    
}
