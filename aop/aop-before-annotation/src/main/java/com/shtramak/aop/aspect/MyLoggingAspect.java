package com.shtramak.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Before("execution(* add*(com.shtramak.aop.entity.Account,..))")
    public void beforeAddAccount(){
        System.out.println("\n ======> Hi from @Before advice on addMembership() in" + this.getClass()+"\n");
    }
}
