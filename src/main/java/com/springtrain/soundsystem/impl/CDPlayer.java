package com.springtrain.soundsystem.impl;

import com.springtrain.soundsystem.itf.CompactDisc;
import com.springtrain.soundsystem.itf.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    /**
     * 不管是构造器、Setter方法还是其他的方法，Spring都会尝试满足方法 参数上所声明的依赖。
     * 假如有且只有一个bean匹配依赖需求的话，那 么这个bean将会被装配进来。
     * 如果没有匹配的bean，那么在应用上下文创建的时候，Spring会抛出 一个异常。
     * 为了避免异常的出现，你可以将@Autowired的 required属性设置为false：
     * @Autowired(required = false)
     *
     * 将required属性设置为false时，Spring会尝试执行自动装配，但是如果没有匹配的bean的话，Spring将会让这个bean处于未装配的状 态。
     * 但是，把required属性设置为false时，你需要谨慎对待。如果在你的代码中没有进行null检查的话，这个处于未装配状态的属性 有可能会出现NullPointerException。
     * @param cd
     */
    /*@Autowired
    public CDPlayer(CompactDisc cd){
       this.cd = cd;
    }*/

    @Autowired
    public void setCd(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
