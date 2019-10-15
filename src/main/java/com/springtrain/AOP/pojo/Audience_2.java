package com.springtrain.AOP.pojo;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;

/**
 * 听众类
 *
 */
@Aspect
public class Audience_2 {

    /**
     * 定义命名的切点
     */
    @Pointcut("execution(**com.springtrain.AOP.itf.Performance.perform(..))")
    public void performance(){}

    /**
     * 手机调至静音状态
     * 表演之前
     */
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    /**
     * 就坐
     * 表演之前
     */
    @Before("performance()")
    public void takeSeats(){
        System.out.println("take seats");
    }

    /**
     * 鼓掌喝彩
     * 表演之后
     */
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("clap clap clap !!!");
    }

    /**
     * 如果演出没有达到观众预期 的话，观众会要求退款
     * 表演失败之后
     */
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("demanding a refund");
    }
}
