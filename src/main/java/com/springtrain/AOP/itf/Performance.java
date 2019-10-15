package com.springtrain.AOP.itf;

/**
 * Performance可以代表任何类型的现场表演，如舞台剧、电影或音 乐会。
 *
 * 假设我们想编写Performance的perform()方法触发的通 知。
 *
 * execution(* com.springtrain.AOP.itf.Performance.perform(..))
 * 我们使用execution()指示器选择Performance的perform()方 法。方法表达式以“*”号开始，表明了我们不关心方法返回值的类型。
 * 然后，我们指定了全限定类名和方法名。对于方法参数列表，我们使用两个点号（..）表明切点要选择任意的perform()方法，无论该方法的入参是什么。
 *
 * 现在假设我们需要配置的切点仅匹配com.springtrain.AOP包。在此场景下，可 以使用within()指示器来限制匹配:
 * execution(* com.springtrain.AOP.itf.Performance.perform(..) && within(com.springtrain.AOP.*))
 */
public interface Performance {
    public void perform();
}
