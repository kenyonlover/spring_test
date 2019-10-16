package com.springtrain.AOP.config;

import com.springtrain.AOP.pojo.Audience_2;
import com.springtrain.AOP.pojo.Audience_3;
import com.springtrain.AOP.pojo.Audience_4;
import com.springtrain.AOP.pojo.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {

    /**
     * 生命Audience_2 Bean
     * @return
     */
    @Bean
    public Audience_2 audience_2(){
        return new Audience_2();
    }

    @Bean
    public Audience_3 audience_3(){
        return new Audience_3();
    }

    @Bean
    public Audience_4 audience_4(){
        return new Audience_4();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return  new EncoreableIntroducer();
    }
}
