package com.springtrain.soundsystem.config;

import com.springtrain.soundsystem.aspect.TrackCounter;
import com.springtrain.soundsystem.impl.BlankDisc;
import com.springtrain.soundsystem.impl.BlankDisc_2;
import com.springtrain.soundsystem.itf.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc_2 cd = new BlankDisc_2();
        cd.setTitle("Sgt. Papper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt. Papper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from my Friends");
        tracks.add("Lucy in the sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
