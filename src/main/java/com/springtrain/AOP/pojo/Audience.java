package com.springtrain.AOP.pojo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 听众类
 *
 */
@Aspect
public class Audience {
    /**
     * 手机调至静音状态
     * 表演之前
     */
    @Before("execution(**com.springtrain.AOP.itf.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    /**
     * 就坐
     * 表演之前
     */
    @Before("execution(**com.springtrain.AOP.itf.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("take seats");
    }

    /**
     * 鼓掌喝彩
     * 表演之后
     */
    @AfterReturning("execution(**com.springtrain.AOP.itf.Performance.perform(..))")
    public void applause(){
        System.out.println("clap clap clap !!!");
    }

    /**
     * 如果演出没有达到观众预期 的话，观众会要求退款
     * 表演失败之后
     */
    @AfterThrowing("execution(**com.springtrain.AOP.itf.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("demanding a refund");
    }
}
