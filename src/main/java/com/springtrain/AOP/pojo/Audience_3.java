package com.springtrain.AOP.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 听众类
 */
@Aspect
public class Audience_3 {

    /**
     * 定义命名的切点
     */
    @Pointcut("execution(**com.springtrain.AOP.itf.Performance.perform(..))")
    public void performance() {
    }

    /**
     * 手机调至静音状态
     * 表演之前
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("silencing cell phones");
            System.out.println("take seats");
            jp.proceed();
            System.out.println("clap clap clap !!!");
        } catch (Throwable throwable) {
            System.out.println("demanding a refund");
            throwable.printStackTrace();
        }

    }

}
