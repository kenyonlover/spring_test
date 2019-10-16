package com.springtrain.AOP.pojo;

/**
 * 听众类
 * 通过xml配置声明切面
 */
public class Audience_4 {
    /**
     * 手机调至静音状态
     * 表演之前
     */
    public void silenceCellPhones() {
        System.out.println("silencing cell phones");
    }

    /**
     * 就坐
     * 表演之前
     */
    public void takeSeats() {
        System.out.println("take seats");
    }

    /**
     * 鼓掌喝彩
     * 表演之后
     */
    public void applause() {
        System.out.println("clap clap clap !!!");
    }

    /**
     * 如果演出没有达到观众预期 的话，观众会要求退款
     * 表演失败之后
     */
    public void demandRefund() {
        System.out.println("demanding a refund");
    }
}
