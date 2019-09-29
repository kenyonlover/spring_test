package com.springtrain.soundsystem.config;

import com.springtrain.soundsystem.impl.CDPlayer;
import com.springtrain.soundsystem.impl.SgtPeppers;
import com.springtrain.soundsystem.itf.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 注解表明这个类是一个配置类，该类应该包含在Spring应用上下文中如何创建bean的细节。
 *
 * @ComponentScan 注解注解能够在Spring中启用组件扫描。
 * 如果没有其他配置的话，@ComponentScan默认会扫描与配置类相 同的包。
 * 因为CDPlayerConfig类位于soundsystem包中，因此 Spring将会扫描这个包以及这个包下的所有子包，查找带 有@Component注解的类。
 * 这样的话，就能发现CompactDisc，并 且会在Spring中自动为其创建一个bean。
 *
 * 有一个原因会促使我们明确地设置基础包，那就是我们想要将配置类 放在单独的包中，使其与其他的应用代码区分开来。
 * 为了指定不同的基础包，你 所需要做的就是在@ComponentScan的value属性中指明包的名称：@ComponentScan(basePackages = "com.springtrain.soundsystem")
 * 如果要设置多个基础包，只需要将basePackages属性设置为要扫描包 的一个数组即可：@ComponentScan(basePackages = {"com.springtrain.soundsystem","com.springtrain.test"})
 */
@Configuration
//@ComponentScan(basePackages = "com.springtrain.soundsystem")
public class CDPlayerConfig {
    /*@Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return  new CDPlayer(sgtPeppers());
    }*/
}

