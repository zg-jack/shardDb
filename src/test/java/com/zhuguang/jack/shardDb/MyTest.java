package com.zhuguang.jack.shardDb;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhuguang.jack.service.UserService;
import com.zhuguang.jack.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring-mysql-db.xml")
public class MyTest {
    
    @Autowired
    UserService userService;
    
    @Test
    public void test1() {
        UserVO userVO = new UserVO();
        userVO.setUsername("烛光学院Roy老师");
        userVO.setPassword("123456");
        userVO.setSex(0);
        userService.addUser(userVO);
    }
    
    @Test
    public void test2() {
        List<UserVO> list = userService.findUser();
        System.out.println(list);
    }
}
