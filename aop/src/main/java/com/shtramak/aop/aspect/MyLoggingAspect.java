package com.shtramak.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Before("execution(public void add*())")
    public void beforeAddAccount(){
        System.out.println("\n ======> Hi from @Before advice on addAccount() in" + this.getClass()+"\n");
    }
}
