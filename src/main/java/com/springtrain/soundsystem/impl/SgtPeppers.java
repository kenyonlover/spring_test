package com.springtrain.soundsystem.impl;

import com.springtrain.soundsystem.itf.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @Component注解表明该类会作为组件类，并告知Spring要为这个类创建 bean。
 */
@Component
public class SgtPeppers implements CompactDisc {
    public String title = "Sgt. Papper's Lonely Hearts Club Band";
    public String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
