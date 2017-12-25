package com.zhuguang.jack.service;

import java.util.List;

import com.zhuguang.jack.annotation.TargetDataSource;
import com.zhuguang.jack.vo.UserVO;

/** 
 *  往期视频加小露老师QQ：1533922121
 *  Jack老师QQ： 2943489129
 *  时间   ：     2017年12月25日 下午8:29:45 
 *  作者   ：   烛光学院【Jack老师】
 *  
 *  我们的读findUser操作和写操作addUser操作的数据库要不一样，这样就可以达到一个数据路由的目的
 */

public interface UserService {
    
    /** 
     *  往期视频加小露老师QQ：1533922121
     *  Jack老师QQ： 2943489129
     *  时间   ：     2017年12月25日 下午8:35:17 
     *  作者   ：   烛光学院【Jack老师】
     *  这个findUser需要操作读数据库
     */
    @TargetDataSource("read")
    public List<UserVO> findUser();
    
    @TargetDataSource("write")
    public void addUser(UserVO userVO);
}
