package com.springtrain.AOP.impl;

import com.springtrain.AOP.itf.Encoreable;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("this is Encoreable's impl");
    }
}
