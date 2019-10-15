package com.springtrain.soundsystem;

import com.springtrain.soundsystem.config.CDPlayerConfig;
import com.springtrain.soundsystem.itf.CompactDisc;
import com.springtrain.soundsystem.itf.MediaPlayer;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    public final SystemOutRule log = new SystemOutRule();

    /*使用自动注册和基于Java配置时使用@Autowired*/
    /*@Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;*/

    @Test
    public void cdShouldNotBeNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/CDPlayerConfig.xml");
        CompactDisc cd = (CompactDisc) applicationContext.getBean("compactDisc");
        assertNotNull(cd);
    }

    @Test
    public void play(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/CDPlayerConfig.xml");
        MediaPlayer player = (MediaPlayer) applicationContext.getBean("cdPlayer");
        player.play();
        assertEquals("Playing Sgt. Papper's Lonely Hearts Club Band by The Beatles\n" ,log.getLog());
    }
}
