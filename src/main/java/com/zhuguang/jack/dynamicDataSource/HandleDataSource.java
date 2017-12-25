package com.zhuguang.jack.dynamicDataSource;

/** 
 *  往期视频加小露老师QQ：1533922121
 *  Jack老师QQ： 2943489129
 *  时间   ：     2017年12月25日 下午8:52:20 
 *  作者   ：   烛光学院【Jack老师】
 *  
 *  用户的请求和我们的数据源进行一一绑定
 */

public class HandleDataSource {
    //ThreadLocal里面就是有一个map，map的可以就是当前的线程的id，就是当前请求的线程的id
    
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();
    
    public static void putDataSource(String dataSource) {
        System.out.println("dataSource : " + dataSource);
        holder.set(dataSource);
    }
    
    public static String getDataSource() {
        return holder.get();
    }
}
