package org.icycodes;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/*
this is a logging aspect which can contain n number of point cuts
associated with any class in java.

 */
@Aspect
@Component
public class Logging {

    /*this is known as point cut in AOP where a simple code is written which will be

    in execution first we define (returnType, package.class.subclass(if any).methodName)
    so the * denoted all means any return type

    */
    @Before("execution(* org.icycodes.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
        System.out.println(jp.getArgs()[0].toString());
        System.out.println("Logger working");
    }


    /*this is known as point cut in AOP where a simple code is written, which will be
    in execution after that particular or any function (based on the defination in execution)
    is called.
    first we define (returnType, package.class.subclass(if any).methodName)
    so the * denoted all means any return type

    (..) the two dots inside the checkout means checkout function with any type
    of arguement will be called.

    */

    @After("execution(*  org.icycodes.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("after Logger working");
    }


    @Pointcut("execution(* org.icycodes.ShoppingCart.quant(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "str")
    public void afterReturning(int str){
        System.out.println("value is : " + str);
    }
}
