package com.zhuguang.jack.dynamicDataSource;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;

import com.zhuguang.jack.annotation.TargetDataSource;

/** 
 *  往期视频加小露老师QQ：1533922121
 *  Jack老师QQ： 2943489129
 *  时间   ：     2017年12月25日 下午9:03:36 
 *  作者   ：   烛光学院【Jack老师】
 *  
 *  动态的切换环境的切面，对我们的服务层的方法进行代理
 *  当前用户访问的线程与我们的数据源的字符串建立映射关系
 */

@Aspect
@Order(-1)
public class DataSourceAspectJ {
    
    @Before(value = "execution(* com.zhuguang.jack.service..*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("before annotation 方法增强启动！");
        
        Object target = joinPoint.getTarget();
        
        String targetMethodName = joinPoint.getSignature().getName();
        
        Class<?>[] interfaceszz = target.getClass().getInterfaces();
        
        Class<?>[] parameterTypezz = ((MethodSignature)joinPoint.getSignature()).getMethod()
                .getParameterTypes();
        
        for (Class<?> interfacezz : interfaceszz) {
            try {
                Method intfMethod = interfacezz.getMethod(targetMethodName,
                        parameterTypezz);
                if (intfMethod != null) {
                    if (intfMethod.isAnnotationPresent(TargetDataSource.class)) {
                        TargetDataSource targetDataSource = intfMethod.getAnnotation(TargetDataSource.class);
                        //这个就是建立当前线程与数据源字符串的映射关系
                        HandleDataSource.putDataSource(targetDataSource.value());
                    }
                    else {
                        HandleDataSource.putDataSource("read");
                    }
                }
                else {
                    continue;
                }
            }
            catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
