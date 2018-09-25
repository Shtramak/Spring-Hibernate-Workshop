package com.shtramak.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(* com.shtramak.aop.dao.*.add*(..))")
    public void forBeforeAnnotation(){}

    @Before("forBeforeAnnotation()")
    public void beforeAddAccount(){
        System.out.println("\n ======> Hi from @Before advice on addMembership() in" + this.getClass()+"\n");
    }

    @Before("forBeforeAnnotation()")
    public void beforeAddSomeLogid(){
        System.out.println("\n ======> Here is some big logic...");
    }
}
