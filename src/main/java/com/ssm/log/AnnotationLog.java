package com.ssm.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationLog {

    @Before("execution(* com.ssm.service.*.*(..))")
    public void before(){
        System.out.println("方法执行前！");
    }
    @AfterReturning("execution(* com.ssm.service.*.*(..))")
    public void afterReturning(){
        System.out.println("方法执行返回后！");
    }
}
