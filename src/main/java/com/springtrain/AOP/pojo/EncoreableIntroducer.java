package com.springtrain.AOP.pojo;

import com.springtrain.AOP.impl.DefaultEncoreable;
import com.springtrain.AOP.itf.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.springtrain.AOP.itf.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
